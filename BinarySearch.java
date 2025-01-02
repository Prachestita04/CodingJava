import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        //usingBinarySearch(arr);
        usingPredefinedMethod(arr);
    }

    private static void usingBinarySearch(int[] a) {
        boolean flag = false;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("After sorting the sorted array is:");
        for (int j = 0; j < a.length; j++) {
            System.out.print(a[j] + " ");
        }
        System.out.println("\nEnter your search element:");
        int key = sc.nextInt();
        int low = 0, high = a.length - 1;
        while (low < high) {
            int mid = (low + high) / 2;
            if (key == a[mid]) {
                System.out.println("Element found at position: " + mid);
                flag = true;
                break;
            } else if (key > a[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        if (!flag) {
            System.out.println("Element not found");
        }
    }

    private static void usingPredefinedMethod(int[] b) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < b.length; i++) {
            for (int j = i + 1; j < b.length; j++) {
                if (b[i] > b[j]) {
                    int temp = b[i];
                    b[i] = b[j];
                    b[j] = temp;
                }
            }
        }
        System.out.println("After sorting the sorted array is:");
        for (int j = 0; j < b.length; j++) {
            System.out.print(b[j] + " ");
        }
        System.out.println("\nEnter your search element:");
        int key = sc.nextInt();
        System.out.println(Arrays.binarySearch(b, key));
    }
}