package algorithm.codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No1620DigitsSum {
    public static void main(String[] args) throws IOException {
        // BufferedReader를 활용해 int n을 입력받는다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // int n의 자릿수와 자릿수의 합을 대입할 변수를 선언한다.
        int length = (int)(Math.log10(n) + 1);
        int sum;

        while (length != 1) { //int n이 1의 자리가 되면 루프를 빠져나간다.
            sum = 0; //반복이 될 때마다 sum = 0 으로 초기화한다.
            for (int i = 0; i < length; i++) { //int n의 자릿수만큼 반복한다.
                sum += n % 10; //sum은 n의 각 자릿수의 합계이다.
                n /= 10;
            }
            n = sum; //n을 다시 sum으로 초기화한다.
            length = (int)(Math.log10(n) + 1); //새로운 n의 자릿수를 구한다.
        }
        System.out.println(n);
    }
}
