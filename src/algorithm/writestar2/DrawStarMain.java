package algorithm.writestar2;

import java.util.Scanner;

public class DrawStarMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DrawStar drawStar = new DrawStar();
        int n = sc.nextInt();

        drawStar.square(n);
    }
}
