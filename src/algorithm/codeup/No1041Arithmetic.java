package algorithm.codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No1041Arithmetic {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int characterAsciiCode = br.readLine().charAt(0);
        System.out.println((char)(characterAsciiCode + 1));
    }
}