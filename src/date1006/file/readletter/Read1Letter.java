package date1006.file.readletter;

import java.io.FileReader;
import java.io.IOException;

public class Read1Letter {
    public static void main(String[] args) throws IOException {

        FileReader reader = new FileReader("afile.txt");
        char c = (char) reader.read();
        System.out.println(c);
    }
    /*
    출력결과
    h
    */
}
