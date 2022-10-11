package algorithm.programmers.adddigits;

public class Solution3 {
    public int solution (int n) {

        int answer = 0;
        int length = (int)(Math.log10(n) + 1);

        for (int i = 0; i < length; i++) {
            answer += n % 10;
            n = n / 10;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution3 sol3 = new Solution3();
        System.out.println(sol3.solution(15234));
    }
}
