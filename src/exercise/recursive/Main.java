package exercise.recursive;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(factorial.calc(x));
    }
}
