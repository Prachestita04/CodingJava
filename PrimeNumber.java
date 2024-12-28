import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        int num = sc.nextInt();
        testPrimeNumber(num);
    }

    private static void testPrimeNumber(int n) {
        int count = 0;
//        if(n>1){
//            for(int i= 1;i<=n;i++){
//                if (n%i==0){
//                    count++;
//                }
//            }
//            if(count==2){
//                System.out.println("The given number is a prime number");
//            }
//            else {
//                System.out.println("The given number is not a prime number");
//            }
//        }
//        else {
//            System.out.println("The given number is not a prime number");
//        }

        //optimize approach
        if (n <= 1) {
            System.out.println("Not a prime number");
        }
        for (int i = 2; i * i <= n; i++) {  // n range sqrt(n)
            if (n % i == 0) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Prime number");
        } else {
            System.out.println("Not prime number");
        }
    }

}
