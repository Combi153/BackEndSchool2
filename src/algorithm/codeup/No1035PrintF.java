package algorithm.codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No1035PrintF {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String strHex = br.readLine(); //문자열 입력
        int intHex = Integer.parseInt(strHex, 16); //16진수에서 10진수로 바꾸기
        String strOctal = Integer.toOctalString(intHex); //10진수를 8진수로 바꾸기
        System.out.println(strOctal);
    }
}
/*
{
        {3,23,85,34,17,74,25,52,65},
        {10,7,39,42,88,52,14,72,63},
        {87,42,18,78,53,45,18,84,53},
        {34,28,64,85,12,16,75,36,55},
        {21,77,45,35,28,75,90,76,1},
        {25,87,65,15,28,11,37,28,74},
        {65,27,75,41,7,89,78,64,39},
        {47,47,70,45,23,65,3,41,44},
        {87,13,82,38,31,12,29,29,80},
        }
*/
