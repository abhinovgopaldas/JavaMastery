package OOP.PolymorphismPractice;

public class Tester extends Employee {
    private String technology;
    public Tester(String name,double salary, String technology){
        super(name,salary);
        this.technology = technology;
    }
    public String getTechnology(){
        return technology;
    }
    public void work(){
        super.work();
        System.out.println("Employee name: "+getName()+ ", Salary: "+getSalary()+ ", Testing Technology: "+getTechnology());
    }

    public static void main(String[] args) {
        Tester t = new Tester("Matt", 55000,"QA Testing");
        Tester t1 = new Tester("Johnan", 19000,"Manual Testing");
        t.work();
        t1.work();
    }

}
