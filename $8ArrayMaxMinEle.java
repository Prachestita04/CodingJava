import java.util.Scanner;

public class $8ArrayMaxMinEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array size:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter array elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        findMaxMin(arr);

    }

    private static void findMaxMin(int[] a) {
        int min = a[0], max = a[0];
        for (int j = 0; j < a.length; j++) {
            if (min > a[j]) {
                min = a[j];
            }
            if (max < a[j]) {
                max = a[j];
            }
        }
        System.out.println("The minimum element in an array is: " + min);
        System.out.println("The maximum element in an array is:  " + max);
    }
}
