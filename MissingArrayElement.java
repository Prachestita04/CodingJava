public class MissingArrayElement {
    public static void main(String[] args) {
        int[] a = {4, 5, 6, 8};
        findMissingElement(a);
    }

    private static void findMissingElement(int[] arr) {
        int large = arr[0], small = arr[0], sum = 0, sumArr = 0;
        boolean flag = false;
        for (int t = 0; t < arr.length; t++) {
            int checkElement = arr[t];
            for (int c = t + 1; c < arr.length; c++) {
                if (checkElement == arr[c]) {
                    flag = true;
                    break;
                }
            }
        }
        if (flag) {
            System.out.println("Give distinct elements in your array");
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (small > arr[i]) {
                    small = arr[i];
                }
                if (large < arr[i]) {
                    large = arr[i];
                }
            }
            for (int j = small; j <= large; j++) {
                sum = sum + j;
            }
            for (int k = 0; k < arr.length; k++) {
                sumArr = sumArr + arr[k];
            }
            int miss = sum - sumArr;
            System.out.println("The missing element in an array is:" + miss);
        }
    }
}
