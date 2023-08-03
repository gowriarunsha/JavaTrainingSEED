package day2;
import day1.Employee;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Predicate;

//Write predicate functions for the following cases.
//        - Employees who have more than 5 years of experience
//        - Employees who belong to HR department
//Find all the employees who have more than 5 years of exp and belong to the HR department.
//Find the average salary of all the employees who belong the Engg department (Use Reduce function)

public class StreamAPIEmp{
    public static void main(String[] args) {
        //create collection of Employee objects
        Employee e1=new Employee( "Gowri",22,1100000,7,"Engineering",5);
        Employee e2=new Employee( "Gayathry",22,1000000,4,"Engineering",4);
        Employee e3=new Employee( "Gia",22,900000,7,"HR",5);
        Employee e4=new Employee( "Allen",22,600000,2,"Engineering",3);
        Employee e5=new Employee( "Joan",22,800000,1,"Engineering",1);
        Employee e6=new Employee( "Karthik",22,1100000,0,"Data Engineering",2);
        Employee e7=new Employee("Gayathry",22,1000000,10,"Application Development",5);
        Employee e8=new Employee("Allen",27,400000,9,"HR",4);
        Employee e9=new Employee("Joan",30,700000,3,"HR",5);
        Employee e10=new Employee("Lohit",30,1100000,7,"App Development",5);
        List<Employee> employees=new ArrayList<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);
        employees.add(e6);
        employees.add(e7);
        employees.add(e8);
        employees.add(e9);
        employees.add(e10);

        //conditions to be checked defined as predicates
        //Predicate<ClassName> variable= (e) ->e.field >0;

        Predicate<Employee> Engineering = (e) -> e.dept.equals("Engineering");
        Predicate<Employee> HR5= (e) -> e.dept.equals("HR") && e.yearsOfExp>5;

        //test() inbuilt function used to test predicate
        //System.out.println("hi:"+HR5.test(e1));
        /*
        List<Employee> filteredList=employees.stream()
                .filter(expGreaterThan5)
                .map(x->{System.out.println(x.name);
                    return x;})
                .collect(Collectors.toList());
         */
        //list for employees satisfying HR5
        List<Employee> HR5List=new ArrayList<>();
        //counter
        AtomicInteger c=new AtomicInteger(0);

        double avg=employees.stream()
                .peek(e->
                {
                    if(HR5.test(e))
                    {
                        HR5List.add(e);
                        e.print();
                    }
                })
                .filter(Engineering)
                .mapToDouble(x->x.salary)
                .reduce(0.0,(acc,e)->
                {
                    c.incrementAndGet();
                    acc=((acc*(c.intValue()-1))+e)/c.intValue();
                    return acc;
                });

        System.out.println("Average salary of Engineering department= Rs."+avg+"/-");
    }
}
