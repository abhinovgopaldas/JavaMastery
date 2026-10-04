package OOP;

public class OnlineShoppingOrderPaymentServices {
    public static void main(String[] args) {
        OnlineShoppingOrder order1 = new OnlineShoppingOrder("Laptop",1,750);
        OnlineShoppingOrder order2 = new OnlineShoppingOrder("Candy",1,15);
        System.out.println("Your Order : "+order1.getProduct()+ ". Price: "+order1.getPrice()+ " Total Products: "+order1.getQuantity()+" total is "+order1.totalPrice());
        System.out.println("Your Order : "+order2.getProduct()+ ". Price: "+order2.getPrice()+ " Total Products: "+order2.getQuantity()+" total is "+order2.totalPrice());
        order2.setQuantity(4);
        System.out.println("Your Order : "+order2.getProduct()+ ". Price: "+order2.getPrice()+ " Total Products: "+order2.getQuantity()+" total is "+order2.totalPrice());


    }
}
