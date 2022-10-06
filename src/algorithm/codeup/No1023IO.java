package algorithm.codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No1023IO {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] doubleStr = br.readLine().split("\\.");
        System.out.println(doubleStr[0]);
        System.out.println(doubleStr[1]);
    }
}
