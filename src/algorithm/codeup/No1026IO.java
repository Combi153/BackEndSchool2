package algorithm.codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No1026IO {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] timeArray = br.readLine().split(":");
        System.out.println(Integer.parseInt(timeArray[1]));
    }
}
