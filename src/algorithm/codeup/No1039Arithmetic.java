package algorithm.codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class No1039Arithmetic {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long[] numbers= Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
        long sumOfNumbers = numbers[0] + numbers[1];
        System.out.println(sumOfNumbers);
    }
}