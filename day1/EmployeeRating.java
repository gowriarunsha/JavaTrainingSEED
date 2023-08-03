package day1;

import java.util.List;
import java.util.ArrayList;

public class EmployeeRating {
    public static void main(String[] args) {
//Print the name and department of all the employees who have more than 5 years of experience
//Find out salary increments for all the employees using the following criteria and print their names and incremented salary
//  Employees who belong to the HR department and has a rating of 5 will get a 10% increment
//  Employees who belong to the HR department and has a rating of 4 will get 8% increment
//  All other employees will get an increment of 7%

        Employee e1=new Employee("Gowri",22,1100000,2,"Data Engineering",5);
        Employee e2=new Employee("Gayathry",22,1000000,5,"Application Development",5);
        Employee e3=new Employee("Allen",27,400000,2,"HR",4);
        Employee e4=new Employee("Joan",30,700000,3,"HR",5);
        Employee e5=new Employee("Lohit",30,1100000,3,"App Development",5);

        /*
        Employee ex=new Employee("Gowri",22,1100000,2,"Data Engineering",5);
        System.out.println("Hash of e1"+e1.hashCode());
        System.out.println("Hash of e2"+e2.hashCode());
        System.out.println("Hash of ex"+ex.hashCode());
        Employee.leave+=1;
         */

        List<Employee> employees=new ArrayList<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);

        System.out.println("Name and department of all the employees who have more than 5 years of experience:");
        for(Employee employee: employees)
        {
            if(employee.yearsOfExp>5)
            {
                System.out.println("Name:"+employee.name+"\tDepartment:"+employee.dept);
            }
        }
        for(Employee employee: employees)
        {
            int inc=0;
            if(employee.dept=="HR" && employee.rating==5)
            {
                inc=10;
            }
            else if(employee.dept=="HR" && employee.rating==4)
            {
                inc=8;
            }
            else {
                inc = 7;
            }
            System.out.println("Name:"+employee.name+"\tSalary increment:"+inc);
        }
    }
}