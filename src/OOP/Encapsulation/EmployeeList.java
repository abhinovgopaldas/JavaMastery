package OOP;

public class EmployeeList {
    String name; //  instance variable
    int salary; // instance variable

    public void showDetails(){ // instance method
        System.out.println("Name of the Employee :"+name+ " salary is "+salary);
    }
    public static void main(String[] args){
        EmployeeList employee1 = new EmployeeList();
        EmployeeList employee2 = new EmployeeList();
        employee1.name = "Abhinov Kumar";
        employee1.salary = 25000;
        employee2.name = "Abhinov Kumar Gopaldas";
        employee2.salary = 35000;
        employee1.showDetails();
        employee2.showDetails();
    }
}
