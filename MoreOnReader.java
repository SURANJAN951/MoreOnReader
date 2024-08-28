import javax.annotation.processing.Filer;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class MoreOnReader {
    public static void main(String[] args) throws Exception {
        File dir= new File("PwJava");
        File file = new File(dir,"pwsills.txt");

        FileReader fr = new FileReader(file);

        char ch[]=new char[(int)(file.length())];//ham yaha char type array create kiye
        //jiska length file size ke equal hoga aur ye char type hai isliye (int) type cast kiye.

        fr.read(ch);

        for(char data:ch)
        {
            System.out.println(data);
        }

    }
}
