import java.io.*;
import java.util.Scanner;

public class ReadingTextFile {
    public static void main(String[] args) throws IOException {
//        readFileApproach1();
//        readFileApproach2();
        readFileApproach3();
    }
    private static void readFileApproach1() throws IOException {
        FileReader fr = new FileReader("C:\\Users\\user\\Desktop\\ExamplaJavaFile.txt");
        BufferedReader br = new BufferedReader(fr);
        String str;
        while ((str= br.readLine())!=null){
            System.out.println(str);
        }
        br.close();
    }
    private static void readFileApproach2() throws IOException {
        File f = new File("C:\\Users\\user\\Desktop\\ExamplaJavaFile.txt");
        Scanner sc = new Scanner(f);
        while (sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }
    }
    private static void readFileApproach3() throws IOException{
        File f1 = new File("C:\\Users\\user\\Desktop\\ExamplaJavaFile.txt");
        Scanner sc = new Scanner(f1);
        sc.useDelimiter("\\z");
        System.out.println(sc.next());

    }
}
