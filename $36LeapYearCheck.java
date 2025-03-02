import java.util.Scanner;

public class $36LeapYearCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter one year to check: ");
        int year = sc.nextInt();
        System.out.println(checkLeapYear(year));
    }
    private static int checkLeapYear(int y1){
        if ((y1%400)==0){
            System.out.println("Checking Successful....");
            System.out.print("Leap year ");
        } else if ((y1%4==0)&&(y1%100!=0)) {
            System.out.println("Successful");
            System.out.print("Leap year ");
        }
        else {
            System.out.print("Not a leap year ");
        }
        return y1;
    }
}
