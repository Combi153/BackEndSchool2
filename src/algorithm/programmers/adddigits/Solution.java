package algorithm.programmers.adddigits;

public class Solution {
    public int solution(int n){
        String strNumber = String.valueOf(n); //int n을 String으로 형변환
        String[] strNumbers = strNumber.split(""); //String을 String[]으로 저장
        int answer = 0;

        //반복문에서 배열의 요소를 int로 형변환하며 answer에 더하기
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
