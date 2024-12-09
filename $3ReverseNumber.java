import java.util.Scanner;

public class $3ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int num = sc.nextInt();
       // usingAlgorithm(num);
       // usingStringBuffer(num);
        usingStringBuilder(num);

    }

    private static void usingAlgorithm(int x) {
        int rev = 0;
        while (x != 0) {
            rev = rev * 10 + x % 10;
            x = x / 10;
        }
        System.out.println("The reversed number is: " + rev);
    }

    private static void usingStringBuffer(int a){
        StringBuffer sb = new StringBuffer(String.valueOf(a));
        StringBuffer rev = sb.reverse();
        System.out.println("After reversing the value is: "+rev);
    }

    private static void usingStringBuilder(int b){
        StringBuilder sbl = new StringBuilder();
        sbl.append(b);
        StringBuilder rev=sbl.reverse();
        System.out.println("Reverse value is: "+rev);
    }

}
