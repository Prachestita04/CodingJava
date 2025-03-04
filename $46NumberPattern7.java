import java.util.Scanner;

public class $46NumberPattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter line up to which you want to see the pattern:");
        int line6 = sc.nextInt();
        printNumberPattern7(line6);
    }
    private static void printNumberPattern7(int l6){
        int count =0;
        for (int i=1;i<=l6;i++){
            if(i%2==0){
                int temp=count+1;
                for (int j=count+3;j>=temp;j--){
                    count = count+1;
                    System.out.print(j+" ");
                }
            }
            else {
                for (int j = 1; j <= 3; j++) {
                    count = count + 1;
                    System.out.print(count + " ");
                }
            }
            System.out.println();
        }
    }
}
