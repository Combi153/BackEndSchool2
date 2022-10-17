package algorithm.writestar;

import java.util.Scanner;

public class WriteStar {
    String letter;
    int length;
    Scanner sc;

    public WriteStar() {}

    public WriteStar(String letter, int length) {
        this.letter = letter;
        this.length = length;
    }

    public void setLetterAndLength() {
        this.sc = new Scanner(System.in);
        System.out.println("무엇을 찍을까요?");
        this.letter = sc.next();
        System.out.println("몇 줄을 찍을까요?");
        this.length = sc.nextInt();
        sc.close();
    }

    public void writeRightTriangle(){

        for (int i = 0; i < length + 1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(letter);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public void writePyramid(){

        for (int i = 1; i < length + 1; i++) {
            for (int j = length ; j > i ; j--){
                System.out.print("_");
            }
            for (int j = 0; j < (i * 2) - 1; j++) {
                System.out.print(letter);

            }
            System.out.println();
        }
    }

    public void writeDiamond() {
        for (int i = 1; i < length + 1; i++) {
            for (int j = length ; j > i ; j--){
                System.out.print("_");
            }

            for (int j = 0; j < (i * 2) - 1; j++) {
                System.out.print(letter);
            }
            System.out.println();
        }

        for (int i = length - 1; i > 0; i--) {
            for (int j = length ; j > i ; j--){
                System.out.print("_");
            }

            for (int j = 0; j < (i * 2) - 1; j++) {
                System.out.print(letter);
            }
            System.out.println();
        }
    }

}
