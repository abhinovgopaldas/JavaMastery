package ExceptionHandling.Category1;
import java.util.*;

public class Three {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = s.nextInt();
        System.out.print("Enter b: ");
        int b = s.nextInt();
        System.out.println("Enter name : ");
        String name = s.nextLine();
        System.out.println("Enter index Number: ");
        int n = s.nextInt();

        try{
            System.out.println(a/b);
            System.out.println(name.charAt(n));
        }
        catch(ArithmeticException  | IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }
}
