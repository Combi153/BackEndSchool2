package algorithm.codeup;

import java.util.Scanner;

public class No1356Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();


        String bottomAndTop = "*".repeat(n);
        String middle = "*" + " ".repeat(n - 2) + "*";

        for (int i = 0; i < n; i++) {
            if (i == 0 || i == n - 1) {
                System.out.println(bottomAndTop);
            } else {
                System.out.println(middle);
            }
        }
    }
}
