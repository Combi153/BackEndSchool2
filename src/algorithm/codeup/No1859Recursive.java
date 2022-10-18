package algorithm.codeup;

import java.util.Scanner;

public class No1859Recursive {

    String stars;
    public String printStar(int n) {

        if (n <= 1) {
            stars = "*";
            System.out.println(stars);
            return stars;
        }
        stars = printStar(n - 1) + "*";
        System.out.println(stars);
        return stars;
    }

    public static void main(String[] args) {
        No1859Recursive recursive = new No1859Recursive();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(recursive.printStar(n));
    }
}
