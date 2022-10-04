package backend1004;

import java.util.Scanner;

class Coin {
    private int[] coinType = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
    private int cnt;
    public Coin () {}

    public void payCount(int money) {

        for (int i = 0; i < coinType.length; i++){
            cnt = 0;
            if (money >= coinType[i]){
                cnt = money / coinType[i];
                money -= coinType[i] * cnt;
                System.out.println(coinType[i] + "원 " + cnt + "개");
            } else{
                System.out.println(coinType[i] + "원 " + cnt + "개");
            }
        }
    }
}

public class CoinTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Coin machine = new Coin();

        System.out.print("금액을 넣으세요 : ");
        int money = sc.nextInt();
        machine.payCount(money);
    }
}
