public class RemoveSpecialChars {
    public static void main(String[] args) {
        String s = "Welcome !@!!#!$%$%&* Jav%#$%$%&&%a $#%%*!()%%&%& Program 134676868675";
        System.out.println("Before removing special chars: "+s);
        //usingBuiltinMethod(s);
        usingUserDefinedLogic(s);
    }
    private static void usingBuiltinMethod(String str){
        str = str.replaceAll("[^a-zA-z0-9]","");
        System.out.println("After removing special chars:");
        System.out.println(str);
    }
    private static void usingUserDefinedLogic(String str) {
        for (int i=0;i<str.length();i++){
            if(Character.isLetterOrDigit(str.charAt(i))){
                System.out.print(str.charAt(i));
            }
            else{
                System.out.print(" ");
            }
        }

    }
}
