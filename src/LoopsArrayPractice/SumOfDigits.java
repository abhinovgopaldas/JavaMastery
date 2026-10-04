package LoopsArrayPractice;


//do-while Loop
public class LoopsBasics{ //sum of digits
    public static void main(String[] args){
       int num = 1234; //Assigning 123 to num variable
       int sum = 0;


       while(num>0) {

          int lastDigit = num % 10;
           sum += lastDigit;
           num = num / 10; //1

       }
        System.out.println(sum);

    }
}