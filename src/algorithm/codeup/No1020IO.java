package algorithm.codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No1020IO {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(13);
        String[] strID = br.readLine().split("-");
        sb.append(strID[0]);
        sb.append(strID[1]);
        String strIDNum = sb.toString();
        System.out.println(strIDNum);
    }
}
