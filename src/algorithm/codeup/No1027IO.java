package algorithm.codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No1027IO {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] dateArray = br.readLine().split("\\.");
        System.out.printf("%s-%s-%s", dateArray[2], dateArray[1], dateArray[0]);
    }
}
