package algorithm.writestar;

import java.util.Scanner;

public class WriteStarMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("무엇을 찍을까요?");
        String letter = sc.next();
        WriteStar letterWriter = new WriteStar(letter);
        System.out.println("몇 줄을 찍을까요?");
        int length = sc.nextInt();
        letterWriter.writePyramid(length);
    }
}
