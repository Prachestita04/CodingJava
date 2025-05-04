package DSAPrograms;

import java.util.Arrays;

public class $2StringbubbleSort {
    public static void main(String[] args) {
        String[] arr = {"Prachi", "Alka", "Khushi", "Mamuni"};
        System.out.println(Arrays.toString(doStringBubbleSort(arr)));
    }

    private static String[] doStringBubbleSort(String[] s) {
        int flag = 0;
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s.length - 1 - i; j++) {
                if (s[j].compareTo(s[j + 1]) > 0) {
                    String temp = s[j];
                    s[j] = s[j + 1];
                    s[j + 1] = temp;
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
        return s;
    }
}
