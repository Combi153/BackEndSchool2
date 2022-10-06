package date1006.file;

import java.io.FileReader;
import java.io.IOException;

public class Read1Letter {
    public static void main(String[] args) throws IOException {

        FileReader reader = new FileReader("afile.txt");
        char c = (char) reader.read();
        System.out.println(c);

    }
}
