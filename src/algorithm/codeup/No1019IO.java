package algorithm.codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No1019IO {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strDate = br.readLine().split("\\.");
        int[] numDate = new int[strDate.length];
        for (int i = 0; i < strDate.length; i++) {
            numDate[i] = Integer.parseInt(strDate[i]);
        }
        System.out.printf("%04d.%02d.%02d",numDate[0], numDate[1], numDate[2]);
    }
}
