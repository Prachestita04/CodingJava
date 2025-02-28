import java.util.Arrays;
import java.util.Scanner;

public class $34Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr1 = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("After storing in array the elements are: ");
//        for (int j = 0; j < size; j++) {
//            System.out.println(arr1[j]);
//        }
        System.out.println(Arrays.toString(arr1));
    }
}
