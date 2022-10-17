package algorithm.writestar;

import java.util.Scanner;

public class RightTriangle {
    String letter;

    public RightTriangle() {
        this.letter = "*";
    }
    public RightTriangle(String letter) {
        this.letter = letter;
    }

    public void writeRightTriangle(int length){

        for (int i = 0; i < length + 1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(letter);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

}
