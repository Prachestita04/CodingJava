package DSAPrograms;

import java.util.Arrays;

public class $4StringSelectionSort {
    public static void main(String[] args) {
        String[] arr = {"Prachi", "Alka", "Khushi", "Mamuni"};
        System.out.println(Arrays.toString(doStringSelectionSort(arr)));
    }

    private static String[] doStringSelectionSort(String[] a) {
        int min;
        for (int i = 0; i < a.length; i++) {
            min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j].compareTo(a[min]) < 0) {
                    min = j;
                }
            }
            String temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }
        System.out.println("Sorted array is:");
        return a;
    }
}
