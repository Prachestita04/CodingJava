package DSAPrograms;

//compare with next element then sort

import java.util.Arrays;
import java.util.Scanner;

public class $1BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter elements of array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(doBubbleSort(arr)));

    }

    private static int[] doBubbleSort(int[] a1) {
        int flag = 0;
        for (int i = 0; i < a1.length; i++) {
            for (int j = 0; j < a1.length - 1 - i; j++) {
                if (a1[j] > a1[j + 1]) {
                    int temp = a1[j];
                    a1[j] = a1[j + 1];
                    a1[j + 1] = temp;
                    flag = 1;
                }
            }
            if (flag == 0) {
                System.out.println("Array is already sorted");
                break;
            }
        }
        if (flag != 0) {
            System.out.println("Sorted array is: ");
        }
        return a1;
    }
}
