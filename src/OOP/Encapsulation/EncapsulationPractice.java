package OOP;

public class EncapsulationPractice {
    private String name;
    private int age;
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public static void main(String[] args) {
        EncapsulationPractice e = new EncapsulationPractice();
        e.setName("Abhinov Kumar");
        e.setAge(29);
        String name = e.getName();
        int age = e.getAge();
        System.out.println("Name :"+name+" age :"+age);
        System.out.println(e.name);
    }

}
