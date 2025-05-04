package DSAPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class $5InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter elements of array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(doInsertionSort(arr)));
    }
    private static int[] doInsertionSort(int[] a){
        int temp ,j=0;
        for (int i=0;i<a.length;i++){
            temp = a[i];
            while (j>0 && a[j-1]>temp){
               a[j]=a[j-1];
               j=j-1;
            }
            a[j] = temp;
        }

        return a;
    }
}
