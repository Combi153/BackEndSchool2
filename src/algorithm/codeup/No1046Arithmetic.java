package algorithm.codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class No1046Arithmetic {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long[] numbers = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
        long sum = numbers[0] + numbers[1] +numbers[2];
        double average = sum / 3.0;
        System.out.printf("%d\n%.1f",sum, average);
    }
}