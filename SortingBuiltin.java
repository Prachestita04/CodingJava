import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SortingBuiltin {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter array size:");
//        int size = sc.nextInt();
//        int[] arr= new int[size];
//
//        System.out.println("Enter array elements:");
//        for (int i=0;i< arr.length;i++){
//            arr[i] = sc.nextInt();
//        }
        Integer[] arr2 = {50, 40, 90, 70, 80};
        //usingApproach1(arr);
        //usingApproach2(arr);
        usingReverseOrder(arr2);
    }

    private static void usingApproach1(int[] a) {
        Arrays.parallelSort(a);
        System.out.println("After sorting the array is: " + Arrays.toString(a));
    }

    private static void usingApproach2(int[] b) {
        Arrays.sort(b);
        System.out.println("After sorting the array is: " + Arrays.toString(b));
    }

    private static void usingReverseOrder(Integer[] c) {
        Arrays.sort(c, Collections.reverseOrder());
        System.out.println("After sorting the array is: " + Arrays.toString(c));
    }
}
