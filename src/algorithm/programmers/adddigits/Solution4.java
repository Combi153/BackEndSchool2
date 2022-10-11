package algorithm.programmers.adddigits;

public class Solution4 {
    public int solution (int n) {

        int answer = 0;

        while (n > 0) {
            answer += n % 10;
            n = n / 10;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution4 sol4 = new Solution4();
        System.out.println(sol4.solution(15234));
    }
}
