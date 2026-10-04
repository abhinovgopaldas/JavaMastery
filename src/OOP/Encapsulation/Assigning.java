package OOP;

public class Assigning {
    public static void main(String[] args) {
        CarTest car = new CarTest("Mercedes", "C300", 2014,2500.30);
        CarTest car1 = new CarTest("BMW", "Q9", 2022,2500.30);

        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());
        System.out.println(car.getPrice());
        System.out.println(" ");
        System.out.println(car1.getMake());
        System.out.println(car1.getModel());
        System.out.println(car1.getYear());
        System.out.println(car1.getPrice());

    }


}
