package OOP;

public class EmployeeSalary {
    private String name;
    private double salary;

    EmployeeSalary(String name, double salary){
        this.name = name;
        this.salary = salary;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setSalary(double amount){
        if (amount >=0){
            this.salary = amount;
        }
    }
    public double getSalary(){
        return salary;
    }
    public static void main(String[] args) {
        EmployeeSalary employee1 = new EmployeeSalary("Abhinov Kumar", 70000);
        EmployeeSalary employee2 = new EmployeeSalary("Abhi Kumar", 20000);

        System.out.println(employee1.name);
        System.out.println(employee1.salary);
        System.out.println(employee2.name);
        System.out.println(employee2.salary);
    }

}
