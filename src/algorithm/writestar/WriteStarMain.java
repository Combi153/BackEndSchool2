package algorithm.writestar;

import java.util.Scanner;

public class WriteStarMain {
    public static void main(String[] args) {
        WriteStar letterWriter = new WriteStar();
        letterWriter.setLetterAndLength();
        letterWriter.writeDiamond();
    }
}
