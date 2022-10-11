package algorithm.programmers.adddigits;

public class Solution2 {
    public int solution(int n) {
        int answer = 0;
        int lengthOfNum = (int)(Math.log10(n) + 1);
        int eachNum;
        int divider;

        for (int i = 0; i < lengthOfNum; i++) {
            divider = (int)(Math.pow(10, (lengthOfNum - i - 1)));
            eachNum = n / divider;
            n -= (eachNum * divider);
            answer += eachNum;
        }
        //int length 구하기 방법 : int length = (int)(Math.log10(a)+1);

        return answer;
    }
}
