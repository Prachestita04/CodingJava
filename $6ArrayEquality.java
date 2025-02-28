import java.util.Arrays;

public class $6ArrayEquality {
    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30, 40, 50};
        int[] arr2 = {10, 20, 30, 40, 50};
        //usingPredefinedMethod(arr1, arr2);
        usingUserDefinedApproach(arr1, arr2);
    }

    private static void usingPredefinedMethod(int[] a1, int[] a2) {
        boolean result = Arrays.equals(a1, a2);
        if (result == true)
            System.out.println("Two arrays are equal");
        else
            System.out.println("Two arrays are not equal");
    }

    private static void usingUserDefinedApproach(int[] b1, int[] b2) {
        boolean status = true;
        if (b1.length == b2.length) {
            for (int i = 0; i < b1.length; i++) {
                if (b1[i] != b2[i]) {
                    status = false;
                    break;
                }
            }
            if (status)
                System.out.println("Two arrays are equal");
            else
                System.out.println("Two arrays are not equal");
        } else
            System.out.println("Please give two arrays of same length. ");
    }
}
