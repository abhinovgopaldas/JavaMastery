package LoopsArrayPractice;
// find the larger digit of 58392
public class CountEvenDigits {
    public static void main(String[] args){
        int number = 58392;
        int larger = 0;
        while(number>0){
            int lastDigit = number%10;
            if(lastDigit>larger){
                 larger = lastDigit;
            }
            number = number/10;
        }
        System.out.println(larger);
    }
}
