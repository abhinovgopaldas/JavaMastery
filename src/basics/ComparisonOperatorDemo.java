package basics;

public class ComparisionOperatorDemo {
    public static void main(String[] args){
        int age = 16; // Value of age = 16.
        System.out.println("Are you 18years old to vote = " +(age == 18));
        System.out.println("If you are younger the 18 you are not eligible to vote :"+ (age != 18));
        System.out.println("Are you greater the 18 ? = "+ (age >18));
        System.out.println("Are you younger the 18? =" +(age < 18));
        System.out.println("If you are over 18 you can vote "+( age>=18));
        System.out.println("If you are younger the 18 you are not eligible to vote "+ (age<=18));
        System.out.println("let me know your age is please = "+age);



    }
}
