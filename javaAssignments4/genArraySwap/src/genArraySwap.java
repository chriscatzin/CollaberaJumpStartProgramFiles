import java.util.Arrays;

public class genArraySwap {
    public static void main(String[] args){
        String [] a = {"Array", "Swap"};
        System.out.println("Original First Array: "+ Arrays.toString(a));
        swap(a, 0, 1);
        System.out.println("First Array: "+ Arrays.toString(a));

    }

    public static <T> void swap(T[] a, int i, int j) {
        T temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

}
