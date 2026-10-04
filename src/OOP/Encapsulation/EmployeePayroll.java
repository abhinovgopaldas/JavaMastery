package OOP;

public class EmployeePayroll {
    public static void main(String[] args) {
        EmployeeSalary employee1 = new EmployeeSalary("Abhinov Kumar", 70000);
        EmployeeSalary employee2 = new EmployeeSalary("Abhi Kumar", 20000);

        System.out.println(employee1.getName());
        employee1.setName("Abhi Gopaldas");
        System.out.println(employee1.getName());
        System.out.println(employee1.getSalary());
        employee1.setSalary(85000);
        System.out.println(employee1.getSalary());

    }
}
