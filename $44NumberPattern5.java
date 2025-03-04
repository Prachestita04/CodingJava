import java.util.Scanner;

public class $44NumberPattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter line up to which you want to see the pattern:");
        int line4 = sc.nextInt();
        printNumberPattern5(line4);
    }
    private static void printNumberPattern5(int l4){
        for (int i=1;i<=l4;i++){
            for (int j=l4;j>=i;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
