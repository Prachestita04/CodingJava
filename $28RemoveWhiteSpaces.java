public class $28RemoveWhiteSpaces {
    public static void main(String[] args) {
        String str = "Java   is   an   Object   Oriented    Programming";
        System.out.println("Before removing space is: "+str);
        //removeSpace(str);
        whitespaceRemove(str);
    }
    private static void removeSpace(String s){
        s = s.replaceAll("[\\s]","");
        System.out.println("After removing space is:");
        System.out.println(s);
    }
    private static void whitespaceRemove(String s1){
        //char[] ch = s1.toCharArray();
        System.out.println("After removing space:");
        boolean flag = false;
        for(int i =0;i< s1.length();i++){
            if (Character.isLetterOrDigit(s1.charAt(i))){
                    System.out.print(s1.charAt(i));
            }
            else {
                System.out.print("");
            }
        }

    }
}
