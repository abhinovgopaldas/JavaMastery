package Array;

public class ComparissionArray {
    public static void main(String[] args){
        int[] a = {10, 20, 30, 40};
        int[] b = {10, 20, 30, 40};
        boolean areEqual = true;

        for (int i = 0; i<a.length; i++){
            if(a.length == b.length){
                System.out.println("Length of the arrays are equal");
            }
            if(a[i] != b[i]){
                areEqual = false;
                break;
            }
            System.out.println(areEqual);
        }
    }
}
