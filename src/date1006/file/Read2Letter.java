package date1006.file;

import java.io.FileReader;
import java.io.IOException;

public class Read2Letter {
    public static void main(String[] args) throws IOException {

        FileReader reader = new FileReader("afile.txt");
        for (int i = 0; i < 2; i++) {
            char c = (char) reader.read();
            System.out.print(c);
        }
    }
}
