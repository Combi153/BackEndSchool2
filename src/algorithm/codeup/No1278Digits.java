package algorithm.codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No1278Digits {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //입력을 위해 BufferedReader 객체를 생성한다.
        int n = Integer.parseInt(br.readLine()); //readLine() 메소드로 입력을 읽고, 형 변환하여 int n 변수에 대입한다.
        System.out.println((int)(Math.log10(n) + 1)); // n의 자릿수를 출력하는 공식을 활용하여 출력한다.
    }
}
