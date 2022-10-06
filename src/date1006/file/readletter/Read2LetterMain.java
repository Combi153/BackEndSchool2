package date1006.file.readletter;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class Read2Letter{
    private FileReader reader;

    public Read2Letter(String fileName) {
        try {
            this.reader = new FileReader(fileName);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void print2Letter() {
        for (int i = 0; i < 2; i++) {
            try {
                System.out.println((char)reader.read());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class Read2LetterMain {
    public static void main(String[] args) throws IOException {

        String fileName = "afile.txt";
        Read2Letter read2Letter = new Read2Letter(fileName);
        read2Letter.print2Letter();
    }
    /* 출력결과
    h
    e
    */
}
