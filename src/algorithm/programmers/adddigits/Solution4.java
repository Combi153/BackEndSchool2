package algorithm.programmers.adddigits;

public class Solution4 {
    public int solution (int n) {

        int answer = 0;

        while (n > 0) { //n이 0 이하가 되면, 반복문을 나간다.
            answer += n % 10; //answer에 n을 10으로 나눈 나머지를 더한다.
            n /= 10; //n을 10으로 나눈 몫을 다시 n에 대입한다.
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution4 sol4 = new Solution4();
        System.out.println(sol4.solution(15234));
    }
}
