package date1006.file;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileExercise {



    public void printFiles(String pathname) {
        File dir = new File(pathname);
        File files[] = dir.listFiles();
        // 현재 디렉토리의 파일 목록
        for (File file : files) {
            System.out.println(file);
        }
    }

    public char readAChar(String filename) throws IOException {
        FileReader fileReader = new FileReader(filename);
        return (char)fileReader.read();
    }

    public String read2Chars(String filename) throws IOException {
        FileReader fileReader = new FileReader(filename);
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < 2; i++) {
            str.append((char) fileReader.read());
        }
        return str.toString();
    }

    public String readNChars(String filename, int n) throws IOException {
        FileReader fileReader = new FileReader(filename);
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int asciiCd = fileReader.read();
            if (asciiCd == -1){
                return str.toString();
            }
            str.append((char) asciiCd);
        }
        return str.toString();
    }


    public static void main(String[] args) throws IOException {
        FileExercise fileExercise = new FileExercise();
        fileExercise.printFiles("./");

        System.out.println(fileExercise.readAChar("afile.txt"));
        System.out.println(fileExercise.read2Chars("afile.txt"));
        System.out.println(fileExercise.readNChars("afile.txt", 5));
    }
}
