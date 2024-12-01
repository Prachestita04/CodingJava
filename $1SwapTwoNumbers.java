//using third variable

import java.util.Arrays;
import java.util.Scanner;

public class $1SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        String num1 = sc.nextLine();
        System.out.println("Enter second number:");
        String num2 = sc.nextLine();
        System.out.println(Arrays.toString(swapTwoNumber(num1, num2)));


    }

    private static int[] swapTwoNumber(String x, String y) {
        int[] result = new int[2];
        for (int i = 0; i < x.length(); i+=1) { //i+=1 means i=i+1, i++ replaced with i+2 loop will run 3 times 0,2,4
            if (Character.isLetter(x.charAt(i))) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter a valid integer for first input");
                x = sc.nextLine();
                return swapTwoNumber(x, y);
            }
        }

        for (int i = 0; i < y.length(); i++) {
            if (Character.isLetter(y.charAt(i))) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter a valid integer for second input");
                y = sc.nextLine();
               return swapTwoNumber(x, y);
            }
        }
        int x1 = Integer.parseInt(x);
        int y1 = Integer.parseInt(y);
        int temp = y1;
        y1 = x1;
        x1 = temp;
        System.out.println("After swapping: ");
        result[0] = x1;
        result[1] = y1;
        return result;
    }
}



