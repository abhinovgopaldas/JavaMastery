package Array;
import java.util.Arrays;

public class DecendingOrderSwapping {
    public static void main(String[] args){
        int[] numbers = {10,20,30,40,50,60,70};
        for(int i = 0; i<numbers.length-1;i++){
            for(int j = 0; j< numbers.length-1-i;j++){
                if(numbers[j]>numbers[j+1]){
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
            System.out.println(Arrays.toString(numbers));
        }
    }
}
