package date1006.file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class ReadFile {
    private BufferedReader bufferedReader;
    private int bufferSize;

    public ReadFile(String filename) {
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

public class ReadFileMain {
    public static void main(String[] args) throws IOException {
        ReadFile readNLetter = new ReadFile("afile.txt");
        BufferedReader reader = readNLetter.getBufferedReader();
        String str;
        while((str = reader.readLine()) != null){
            System.out.println(str);
        }
        reader.close();
    }
}
