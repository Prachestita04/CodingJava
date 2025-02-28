import java.util.HashSet;

public class $16DuplicateElementArray {
    public static void main(String[] args) {
        String[] arr = {"Java" ,"C","Python","C","Html"};
        //findDuplicate(arr);
        usingHashSet(arr);
    }
    private static void findDuplicate(String[] a){
        boolean flag=false;
        for (int i=0;i< a.length;i++){
            for (int j=i+1;j< a.length;j++){
                if (a[i]==a[j]){
                    System.out.println("Array contains duplicate element: "+a[i]);
                    flag = true;
                }
            }
        }
        if(!flag){
            System.out.println("Array does not contain any duplicate element ");
        }
    }
    private static void usingHashSet(String[] b){
        HashSet <String>langs = new HashSet();
        boolean flag = false;
//        System.out.println(langs.add("Java"));
//        System.out.println(langs.add("Python"));
//        System.out.println(langs.add("Java"));
        for(String l : b){
            if(langs.add(l)==false){
                System.out.println("Array contains duplicate elements: "+l);
                flag = true;
            }
        }
        if (!flag){
            System.out.println("Array does not contain duplicate element");
        }

    }
}
