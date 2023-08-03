package day1;
public class Employee {
    public String name;
    protected int age;
    public double salary;
    public int yearsOfExp;
    public String dept;
    public int rating;
    public static int leave;
    public Employee(String name, int age, double salary, int yearsOfExp, String dept, int rating)
    {
        this.name=name;
        this.age=age;
        this.salary=salary;
        this.yearsOfExp=yearsOfExp;
        this.dept=dept;
        this.rating=rating;
        leave=10;
    }
    public void print()
    {
        System.out.println("Name:"+this.name+"\tExperience:"+this.yearsOfExp+"\tDepartment:"+this.dept+"\tAge:"+this.age+"\tRating:"+this.rating);
    }
}
