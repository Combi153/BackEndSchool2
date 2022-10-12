package algorithm.codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class No1038Arithmetic {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers= Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Long sumOfNumbers = (long)numbers[0] + (long)numbers[1];
        System.out.println(sumOfNumbers);
    }
}