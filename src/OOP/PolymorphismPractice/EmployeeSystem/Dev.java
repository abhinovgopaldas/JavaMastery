package OOP.PolymorphismPractice;

public class Dev extends Employee{
    private String technology;
    Dev(String name, double salary, String technology){
        super(name, salary);
        this.technology = technology;
    }
    public String getTechnology() {
        return technology;
    }
    @Override
    public void work(){
        System.out.println("Employee "+getName()+", Writes code in "+technology+". His salary is "+getSalary());
    }

    public static void main(String[] args) {
        Dev d = new Dev("Abhinov",75000,"Java");
        String technology = d.getTechnology();
        d.work();
    }
}
