package algorithm.codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class No1045Arithmetic {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int sum = numbers[0] + numbers[1];
        int sub = numbers[0] - numbers[1];
        long mul = (long)numbers[0] * (long)numbers[1];
        int share = numbers[0] / numbers[1];
        int remainder = numbers[0] % numbers[1];
        double div = numbers[0] / (numbers[1] * 1.0);

        System.out.println(sum);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(share);
        System.out.println(remainder);
        System.out.printf("%.2f",div);
    }
}