import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataInFile {
    public static void main(String[] args) throws IOException {
        writeFile();
    }
    private static void writeFile() throws IOException{
        FileWriter fw = new FileWriter("C:\\Users\\user\\Desktop\\WriteJavaFile.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("Java is not purely oop.");
        bw.write("Java uses all the oo approach in programing");
        System.out.println("End of program......");
        bw.close();
    }
}
