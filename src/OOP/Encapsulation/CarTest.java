package OOP;

public class CarTest {
    private String make;
    private String model;
    private int year;
    private double price;

    CarTest(String make, String model, int year, double price){
        setMake(make);
        setModel(model);
        setYear(year);
        setPrice(price);
    }
    public void setMake(String make){
        this.make = make;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setYear(int year){
        this.year = year;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public String getMake(){
        return make;
    }
    public String getModel(){
        return model;
    }
    public int getYear(){
        return year;
    }
    public double getPrice(){
        return price;
    }

    public static void main(String[] args) {
        CarTest car = new CarTest("Abhinov","1995",1995,20000.0356);
        System.out.println(car.getMake());
    }
}
