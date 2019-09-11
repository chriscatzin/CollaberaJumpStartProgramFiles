import java.util.Arrays;
import java.util.Collections;

public class main {

    public static void main(String[] args){
        int[] numArr = { 10, 3, 4, 15, 7, 9, 1, 21 };
        String[] strArr = { "claude", "Phil", "lois",
                "clark", "Arthur", "Mera", "bruce" };

        Arrays.sort(numArr);
        System.out.print("Sorted ASC: ");
        for(int index = 0; index < numArr.length; index++){
            System.out.print(numArr[index] + " ");
        }

        System.out.println();
        System.out.println();
        System.out.print("DESC: ");
        for(int index = 0; index < numArr.length; index++){
            Arrays.setAll(numArr, i -> ~numArr[i]);
            Arrays.sort(numArr);
            Arrays.setAll(numArr, i -> ~numArr[i]);
            System.out.print(numArr[index] + " ");
        }

        System.out.println();
        System.out.println();
        Arrays.sort(strArr);
        //Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER);
        System.out.print("Sorted ASC and CASE SENSITIVITY ON: ");
        //for(int index = 0; index < strArr.length; index++){
        System.out.print(Arrays.toString(strArr) + " ");

        System.out.println();
        System.out.println();
        System.out.print("Sorted ASC and CASE SENSITIVITY OFF: ");
        Arrays.sort(strArr);
        for(int index = 0; index < strArr.length; index++){
            System.out.print(strArr[index] + " ");
        }

        System.out.println();
        System.out.println();
        Arrays.sort(strArr, Collections.reverseOrder());
        System.out.print("Sorted DESC and CASE SENSITIVITY ON: ");
        System.out.print(Arrays.toString(strArr) + " ");

        System.out.println();
        System.out.println();
        Arrays.sort(strArr, Collections.reverseOrder());
        System.out.print("Sorted DESC and CASE SENSITIVITY OFF: ");
        for(int index = 0; index < strArr.length; index++){
            System.out.print(strArr[index] + " ");
        }
        System.out.println();
    }
}
