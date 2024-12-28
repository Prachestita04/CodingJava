import java.util.Scanner;

public class SumArrayElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter elements in array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        // findSumArrayElements(arr);
        findSumEnhancedForLoop(arr);
    }

    private static void findSumArrayElements(int[] arr1) {
        int sum = 0;
        for (int j = 0; j < arr1.length; j++) {
            sum = sum + arr1[j];
        }
        System.out.println("The sum of array elements are:" + sum);
    }

    private static void findSumEnhancedForLoop(int[] arr2) {
        int add = 0;
        for (int element : arr2) {
            add = add + element;
        }
        System.out.println("After addition the result is:" + add);
    }
}
