package OOP.PolymorphismPractice;

public class Employee {
    private String name;
    private double salary;
    Employee (String name,double salary){
        this.name = name;
        this.salary = salary;
    }
    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }
    public void work(){
        System.out.println("Employee "+name+" . Salary is "+salary);
    }
    public static void main(String[] args) {
        Employee e = new Employee("Abhinov", 75000);
        Employee e1 = new Employee("John", 15000);
        Employee e2 = new Employee("Sam", 25000);
        e.work();
        e1.work();
        e2.work();
    }
}
