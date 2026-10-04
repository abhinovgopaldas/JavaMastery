import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int number = s.nextInt();
        if(number>=1){
            System.out.println("Positive Number: "+number);
        }
        else if(number<=-1){
            System.out.println("Negative Number: "+number);
        }
        else {
            System.out.println("Zero");
        }
        s.close();

    }
}
