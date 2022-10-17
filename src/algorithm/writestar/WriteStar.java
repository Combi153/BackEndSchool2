package algorithm.writestar;

public class WriteStar {
    String letter;

    public WriteStar() {
        this.letter = "*";
    }
    public WriteStar(String letter) {
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

    public void writePyramid(int length){

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

}
