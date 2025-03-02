import java.util.Scanner;

public class $39ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check: ");
        int num = sc.nextInt();
        checkArmstrong(num);
    }
    private static void checkArmstrong(int n){
        int count = 0;
        int result = 0;
        int t1=n;
        int arm=t1;
        while (n>0){
            n = n/10;
            count++;
        }
        while (t1!=0){
           int rem;
           int mul =1;
           rem = t1%10;
           for (int j=1;j<=count;j++){
               mul = mul*rem;
           }
           result = result+mul;
            t1=t1/10;
        }
        if (result==arm){
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong number");
        }
    }
}
