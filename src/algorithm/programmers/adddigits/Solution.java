package algorithm.programmers.adddigits;

public class Solution {
    public int solution(int n){
        String strNumber = String.valueOf(n);
        String[] strNumbers = strNumber.split("");
        int answer = 0;

        for (int i = 0; i < strNumbers.length; i++){
            answer += Integer.parseInt(strNumbers[i]);
        }
        return answer;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution(15234));
    }
}
