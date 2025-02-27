import java.util.Arrays;
import java.util.Scanner;

public class CountOccurrenceChars {
    public static void main(String[] args) {
        String str = "Java Programming Language";
        char se = 'a';
        //countOccurrence(str);
        //countByLogicalApproach(str);
        System.out.println("The occurrence of character a is :"+countOneString(str,se));
    }
//    private static void countOccurrence(String s){
//        int total_Count = s.length();
//        int total_Count_afterRemove = s.replace("a","").length();
//        int count = total_Count - total_Count_afterRemove;
//        System.out.println("Occurrence of the character a is: "+count);
//    }
//    private static void countByLogicalApproach(String s1){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter searching character:");
//        char se= sc.next().charAt(0);
//        char[] ch = s1.toCharArray();
//        int count=0;
//
//        for (int j=0;j<ch.length;j++){
//            if (ch[j]==se){
//                count++;
//            }
//        }
//        System.out.println("The occurrence of character "+se+" is "+count);
//    }

    private static int countOneString(String s2,char t){
        int count = 0;
        for (int i=0;i<s2.length();i++){
            if(s2.charAt(i)==t){
                count++;
            }
        }
        return count;
    }
}
