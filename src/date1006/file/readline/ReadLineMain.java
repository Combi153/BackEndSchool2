package date1006.file.readline;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class ReadLine {
    private BufferedReader bufferedReader;
    private int bufferSize;

    public ReadLine(String filename) {
        try {
            this.bufferSize = 16 * 1024;
            this.bufferedReader = new BufferedReader(new FileReader(filename), bufferSize);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public String readOneLine() {
        try {
            String oneLine = bufferedReader.readLine();
            if (oneLine != null) {
                return oneLine;
            } else{
                return "범위를 벗어났습니다.";
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void printNLine(int n) {
        try {
            String oneLine;
            for (int i = 0; i < n; i++) {
                oneLine = bufferedReader.readLine();
                if (oneLine != null) {
                    System.out.println(oneLine);
                } else{
                    System.out.println("출력할 내용이 없습니다.");
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public List<String> readNLine(int n){
        try {
            List<String> lines = new ArrayList<>();
            String oneLine;
            for (int i = 0; i < n; i++) {
                oneLine = bufferedReader.readLine();
                if (oneLine != null) {
                    lines.add(oneLine);
                } else {
                    System.out.println("범위를 벗어났습니다.");
                    return lines;
                }
            }
            return lines;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

public class ReadLineMain {
    public static void main(String[] args) throws IOException {
        ReadLine readline = new ReadLine("afile.txt");

        //System.out.println(readline.readOneLine()); //한 줄 읽기
        System.out.println(readline.readNLine(4)); //n 줄 읽기
        //readline.printNLine(4);

    }
}
