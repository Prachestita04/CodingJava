import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string: ");
        String str1 = sc.nextLine();
        testPalindrome(str1);
    }

    private static void testPalindrome(String s) {
        String rev = "";
        String newStr = s;
        int len = s.length();
        boolean flag = false;
        for (int i = len - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        if (rev.equals(newStr)) {
            System.out.println("The given string is a palindrome string.");
        }
        else {
            System.out.println("It is not a Palindrome string.");
        }

//        for(int j=0;j<=rev.length()-1;j++){
//            if(rev.charAt(j)==newStr.charAt(j)){
//                flag = true;
//            }
//            else {
//                flag = false;
//            }
//        }
//        if(flag){
//            System.out.println("Palindrome");
//        }
//        else {
//            System.out.println("Not Palindrome");
//        }
    }
}
