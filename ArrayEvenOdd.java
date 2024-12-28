import java.util.Scanner;

public class ArrayEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter elements of array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
//        findEvenOddArray(arr);
        usingForEachLoop(arr);
    }

    private static void findEvenOddArray(int[] arr1) {
        System.out.println("The even number of elements are:");
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 2 == 0) {
                System.out.println(arr1[i]);
            }
        }
        System.out.println("The odd number of elements are:");
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 2 != 0) {
                System.out.println(arr1[i]);
            }
        }
    }

    private static void usingForEachLoop(int[] arr2) {
        System.out.println("The even number of elements are:");
        for (int value : arr2) {
            if (value % 2 == 0) {
                System.out.println(value);
            }
        }
        System.out.println("The odd number of elements are:");
        for (int value1 : arr2) {
            if (value1 % 2 != 0) {
                System.out.println(value1);
            }
        }
    }
}
