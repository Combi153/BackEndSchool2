package algorithm.codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class No4596Max {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = 0;
        int row = 0;
        int column = 0;

        for (int i = 0; i < 9; i++) {
            int[] rowInt = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            for (int j = 0; j < rowInt.length; j++) {
                if (max < rowInt[j]) {
                    max = rowInt[j];
                    row = i;
                    column = j;
                }
            }
        }
        System.out.println(max);
        System.out.printf("%d %d", row + 1, column + 1);
    }
}
