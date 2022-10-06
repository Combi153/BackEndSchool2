package date1006.file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class ReadNLetter {
    private BufferedReader bufferedReader;
    private int bufferSize;

    public ReadNLetter(String filename) {
        try {
            this.bufferSize = 16 * 1024;
            this.bufferedReader = new BufferedReader(new FileReader(filename), bufferSize);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public BufferedReader getBufferedReader() {
        return bufferedReader;
    }
}

public class ReadNLetterMain {
    public static void main(String[] args) throws IOException {
        ReadNLetter readNLetter = new ReadNLetter("afile.txt");
        BufferedReader reader = readNLetter.getBufferedReader();
        String str;
        while((str = reader.readLine()) != null){
            System.out.println(str);
        }
        reader.close();
    }
}
