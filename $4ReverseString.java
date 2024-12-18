public class $4ReverseString {
    public static void main(String[] args) {
        String str = "ABCD";
        //usingStringConcat(str);
        //usingCharArray(str);
        usingStringBuffer(str);
    }

    private static void usingStringConcat(String x) {
        String rev = "";
        int len = x.length();
        for (int i = len - 1; i >= 0; i--) {
            rev = rev + x.charAt(i);
        }
        System.out.println("After reverse the new string is: " + rev);
    }

    private static void usingCharArray(String y) {
        String rev1 = "";
        char[] arr = y.toCharArray();
        int len1 = arr.length;
        for (int i = len1 - 1; i >= 0; i--) {
            rev1 = rev1 + arr[i];
        }
        System.out.println("Reverse string is : " + rev1);
    }

    private static void usingStringBuffer(String z) {
        //String rev2="";
        StringBuffer sb = new StringBuffer(z);
        System.out.println("The new reverse string is:");
        System.out.println(sb.reverse());
    }
}
