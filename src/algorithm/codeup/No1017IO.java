package algorithm.codeup;

import java.io.*;

public class No1017IO {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int number = Integer.parseInt(reader.readLine());
        writer.write(number + " " + number + " " + number);
        writer.flush();
        reader.close();
        writer.close();
    }
}
