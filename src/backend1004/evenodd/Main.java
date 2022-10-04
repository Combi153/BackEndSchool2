package backend1004.evenodd;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.print("even");
        } else {
            System.out.print("odd");
        }
    }
}
