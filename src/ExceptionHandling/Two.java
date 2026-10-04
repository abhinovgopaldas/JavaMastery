package ExceptionHandling.Category1;
import java.util.*;

public class Two {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Please enter index number: ");
        int n = s.nextInt();
        int [] numbers = {10,20,30,40,50};
        try{
            System.out.println(numbers[n]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Please enter valid index number");
            e.printStackTrace();
        }
    }
}
