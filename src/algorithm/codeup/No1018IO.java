package algorithm.codeup;

import java.io.*;

public class No1018IO {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] time = br.readLine().split(":");

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(time[0] + ":" + time[1]);
        br.close();
        bw.close();
    }
}
