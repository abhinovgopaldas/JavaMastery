package OOP;

public class EncapsulationTest {
    private String name;

    public static void main(String[] args) {
        EncapsulationTest e = new EncapsulationTest();
        EmployeeList employee1 = new EmployeeList();
        EncapsulationPractice a = new EncapsulationPractice();
        a.getName();
        System.out.println(a.getName());
        employee1.name = "Gopaldas";
        e.name = "Abhinov";
        System.out.println(e.name);
        System.out.println(employee1.name);
    }
}
