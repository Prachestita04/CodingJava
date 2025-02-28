import java.util.Scanner;

public class $15CountWordString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string: ");
        String str = sc.nextLine();
        System.out.println("Total count of the given word is: "+stringWordCount(str));
    }
    private static int stringWordCount(String s){
        int count1=1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' ' && s.charAt(i+1)!=' '){
                count1++;
            }
        }
        return count1;
    }
}
