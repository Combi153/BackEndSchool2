package backend1004;

import java.util.Scanner;

public class CurrencyTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();

        int curr50000 = 50000;
        int curr10000 = 10000;
        int curr5000 = 5000;
        int curr1000 = 1000;
        int curr500 = 500;
        int curr100 = 100;

        System.out.println("5만원 권 : " + money/curr50000);
        money %= curr50000;
        System.out.println("1만원 권 : " + money/curr10000);
        money %= curr10000;
        System.out.println("5천원 권 : " + money/curr5000);
        money %= curr5000;
        System.out.println("1천원 권 : " + money/curr1000);
        money %= curr1000;
        System.out.println("500원 권 : " + money/curr500);
        money %= curr500;
        System.out.println("100원 권 : " + money/curr100);
        money %= curr100;
        System.out.println("남은 돈 : " + money);
    }
}
