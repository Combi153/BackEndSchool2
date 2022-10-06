package algorithm.codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No1025IO {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] intArray = br.readLine().split("");
        for (int i = 0; i < intArray.length ; i++) {
            int num = Integer.parseInt(intArray[i]) * (int)Math.pow(10, intArray.length - 1 - i);
            System.out.printf("[%d]\n", num);
        }
    }
}
