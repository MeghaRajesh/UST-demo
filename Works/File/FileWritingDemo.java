
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWritingDemo {
    public static void main(String [] args){
        FileWriter fw=null;
        try {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter : ");
            String str=sc.nextLine();
            fw = new FileWriter("Sample.txt");
            fw.write(str);
            fw.flush();
        } catch (IOException ex) {
        } finally {
            try {
                fw.close();
            } catch (IOException ex) {
            }
        }

    }
}
