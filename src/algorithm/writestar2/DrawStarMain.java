package algorithm.writestar2;

import java.util.Scanner;

public class DrawStarMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DrawStar drawStar = new DrawStar();

        System.out.println("정사각형 한 변의 길이를 입력하세요");
        int n = sc.nextInt();
        drawStar.printSquare(n);

        System.out.println("직사각형의 높이를 입력하세요");
        int height = sc.nextInt();
        System.out.println("직사각형의 너비를 입력하세요");
        int width = sc.nextInt();

        drawStar.printRectangle(height, width);
    }
}
