import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter Array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        usingBubbleSort(arr);
    }

    private static void usingBubbleSort(int[] a) {
        for (int p = 1; p <= a.length - 1 ; p++) {            //number of passes
            for (int i = 0; i < a.length-1; i++) {            //iteration in each pass
                    if (a[i] > a[i + 1]) {
                        int temp = a[i];
                        a[i] = a[i + 1];
                        a[i + 1] = temp;
                    }
            }
        }
        System.out.println("After sorting the sorted array is" + Arrays.toString(a));
    }
}
