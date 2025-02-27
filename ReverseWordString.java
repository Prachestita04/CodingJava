import java.util.Scanner;

public class ReverseWordString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string which you want to reverse:");
        String str = sc.nextLine();
        System.out.println(stringWordReverse(str));
//        System.out.println(stringWordReverse2(str));
//        System.out.println(stringWordReverse3(str));
    }
    private static String stringWordReverse(String s1){
        String revstr = "";
        for (int i = s1.length()-1;i>=0;i--){
            revstr = revstr + s1.charAt(i);
        }
        return revstr;
    }
    private static String stringWordReverse2(String s2){
        String revstr1 = "";
        String[] sarr = s2.split(" ");
        for (String w : sarr){
            String revstr2 = "";
            for(int j = w.length()-1;j>=0;j--){
                revstr2 = revstr2 + w.charAt(j);
            }
            revstr1 = revstr1 + revstr2+" ";
        }
        return revstr1;
    }
    private static String stringWordReverse3(String s3){
        String[] sarr2 = s3.split("\\s");
        String revstr2 = "";
        for (String w1: sarr2){
            StringBuilder sb = new StringBuilder(w1);
            sb.reverse();
            revstr2 = revstr2 + sb.toString()+" ";
        }
        return revstr2;
    }
}
