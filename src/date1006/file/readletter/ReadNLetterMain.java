package date1006.file.readletter;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class ReadNLetter{
    private FileReader reader;

    public ReadNLetter(String filename) {
        try {
            this.reader = new FileReader(filename);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void printNLetter(int n){
        for (int i = 0; i < n; i++) {
            try {
                int strNum = reader.read();
                if (strNum != -1){
                    System.out.println((char) strNum);
                } else{
                    System.out.println("모두 출력되었습니다.");
                    break;
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class ReadNLetterMain {

    public static void main(String[] args) {
        String fileName = "afile.txt";
        ReadNLetter readNLetter = new ReadNLetter(fileName);
        readNLetter.printNLetter(15);
    }
    /*
    h
    e
    l
    l
    o

    e
    v
    e
    r
    y
    o
    n
    e
    */
}
