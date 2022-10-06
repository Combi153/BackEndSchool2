package algorithm.codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No1024IO {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strArray = br.readLine().split("");
        for (int i = 0; i < strArray.length; i++) {
            System.out.printf("'%s'\n",strArray[i]);
        }
    }
}
