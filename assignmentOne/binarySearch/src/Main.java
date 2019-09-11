import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {

    // Driver method to test above
    int binarySearch(int arr[], int l, int r, int x)
    {
        if (r >= l) {
            int mid = l + (r - l) / 2;

            // If the element is present at the
            // middle itself
            if (arr[mid] == x)
                return mid;

            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);

            // Else the element can only be present
            // in right subarray
            return binarySearch(arr, mid + 1, r, x);
        }

        // We reach here when element is not present
        // in array
        return -1;
    }

    // Driver method to test above
    public static void main(String args[])
    {
        Main ob = new Main();
        //int arr[] = { 2, 3, 4, 10, 40 };

        int num;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array: ");
        num = s.nextInt();
        int arr[] = new int[num+1];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < num; i++)
        {
            arr[i] = s.nextInt();
        }

        int n = arr.length;
        System.out.println("Enter the number you want to find: ");
        int x = s.nextInt();
        int result = ob.binarySearch(arr, 0, n - 1, x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + result);
    }
}
