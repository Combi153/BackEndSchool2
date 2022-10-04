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
                //몫과 나머지를 활용
                //몫
                cnt = money / coinType[i];
                //나머지 연산이 중요
                money %= coinType[i];

                //내 풀이
                // money -= coinType[i] * cnt;
                //생각해보니 얘는 연산이 두 번 이뤄져서 나머지로 연산하는 것이 더 나을 듯하다!

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
