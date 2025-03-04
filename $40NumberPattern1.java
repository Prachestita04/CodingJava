import java.util.Scanner;

public class $40NumberPattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter line up to which you want to see the pattern:");
        int line = sc.nextInt();
        printNumberPattern(line);
    }
    private static void printNumberPattern(int l){
        for (int i =1;i<=l;i++){
            for (int j=1;j<i+1;j++){
                System.out.print(j+" ");
//                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
