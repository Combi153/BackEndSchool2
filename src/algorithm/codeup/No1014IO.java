package algorithm.codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No1014IO {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] strArray = reader.readLine().split(" ");
        System.out.printf("%s %s", strArray[1], strArray[0]);
        reader.close();
    }
}
