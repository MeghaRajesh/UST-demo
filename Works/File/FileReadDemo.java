
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReadDemo {
    public static void main(String[] args) {
        byte[] data=null;
        try {
            FileInputStream fis=new FileInputStream("Sample.txt");
            int size=fis.available();
            data=new byte[size];
            fis.read(data);
            
        } catch (FileNotFoundException ex) {
        } catch (IOException ex) {
        }
        String str=new String(data);
        System.err.println(str);
    }
}
