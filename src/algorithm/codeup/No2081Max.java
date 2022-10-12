package algorithm.codeup;

import java.util.Scanner;

public class No2081Max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int number = 0;
        int idx = 0;

        for (int i = 0; i < 9; i++) {
            number = sc.nextInt();
            if (max < number) {
                max = number;
                idx = i;
            }
        }
        System.out.println(max);
        System.out.println(idx);
    }
}
