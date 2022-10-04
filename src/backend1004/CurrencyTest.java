package backend1004;

import java.util.Scanner;

public class CurrencyTest {
    public static void main(String[] args) {
        int money = 25000;

        int curr50000 = 50000;
        int curr10000 = 10000;
        int curr5000 = 5000;
        int curr1000 = 1000;
        int curr500 = 500;
        int curr100 = 100;
        int curr50 = 50;
        int curr10 = 10;

        System.out.printf("50000원 권 - 몫 : %d, 나머지 : %d\n", money/curr50000, money%curr50000);
        money %= curr50000;
        System.out.printf("10000원 권 - 몫 : %d, 나머지 : %d\n", money/curr10000, money%curr10000);
        money %= curr10000;
        System.out.printf("5000원 권 - 몫 : %d, 나머지 : %d\n", money/curr5000, money%curr5000);
        money %= curr5000;
        System.out.printf("1000원 권 - 몫 : %d, 나머지 : %d\n", money/curr1000, money%curr1000);
        money %= curr1000;
        System.out.printf("500원 권 - 몫 : %d, 나머지 : %d\n", money/curr500, money%curr500);
        money %= curr500;
        System.out.printf("100원 권 - 몫 : %d, 나머지 : %d\n", money/curr100, money%curr100);
        money %= curr100;
        System.out.printf("50원 권 - 몫 : %d, 나머지 : %d\n", money/curr50, money%curr50);
        money %= curr50;
        System.out.printf("10원 권 - 몫 : %d, 나머지 : %d\n", money/curr10, money%curr10);
        money %= curr10;
    }
}
