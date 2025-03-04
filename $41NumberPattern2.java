import java.util.Scanner;

public class $41NumberPattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter line up to which you want to see the pattern:");
        int line1 = sc.nextInt();
        printNumberPattern2(line1);
    }
    private static void printNumberPattern2(int l1){
        int count = 0;
        for (int i=1;i<=l1;i++){
            for (int j=1;j<=i;j++){
                count = count+1;
                System.out.print(count+" ");
            }
            System.out.println();
        }
    }
}
