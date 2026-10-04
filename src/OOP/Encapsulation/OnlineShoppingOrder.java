package OOP;

public class OnlineShoppingOrder {
    private String product;
    private int quantity;
    private double price;
    OnlineShoppingOrder(String product, int quantity, double price){
        setProduct(product);
        setQuantity(quantity);
        setPrice(price);


    }
    public void setProduct(String product){
            this.product = product;
    }
    public String getProduct(){
        return product;
    }
    public void setQuantity(int quantity){
        if(quantity>0) {
            this.quantity = quantity;
        }
    }
    public int getQuantity(){
        return quantity;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public double getPrice(){
        return price;
    }
    public double totalPrice(){
        return price*quantity;
    }
}
