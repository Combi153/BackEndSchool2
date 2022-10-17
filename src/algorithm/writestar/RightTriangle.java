package algorithm.writestar;

import java.util.Scanner;

public class RightTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("몇 줄을 찍을까요?");
        int length = sc.nextInt();

        for (int i = 1; i < length + 1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
