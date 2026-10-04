package ArrayInterviewProblems;

import java.util.Arrays;

public class MoveXerosAgain {
    public static void main(String[] args){
        int[] numbers = {4, 0, 7, 0, 0, 9, 2};
        int position = 0;
        for(int i = 0;i<numbers.length;i++){
            if(numbers[i]!=0){
                numbers[position] = numbers[i];
                position++;
            }
        }
        while(position<numbers.length){
            numbers[position] = 0;
            position++;
        }
        System.out.println(Arrays.toString(numbers));
    }
}
