import java.util.Arrays;
import java.util.Scanner;

public class $2PrintCharsOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string");
        String str = sc.nextLine();
//        System.out.println(Arrays.toString(printCharacters(str)));

        for (int i = 0; i < printCharacters(str).length; i++) {
            System.out.print(printCharacters(str)[i] + " ");
        }
    }

    private static char[] printCharacters(String x) {
        char[] resultArr = new char[x.length()];
        for (int j = 0; j < x.length(); j++) {
            resultArr[j] = x.charAt(j);
        }
        return resultArr;
    }
}
