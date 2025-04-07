package 문제풀이모음.Programmers.Lv_2;

import java.util.Arrays;

public class 피보나치수 {
    /*
     * 2 이상의 n이 입력되었을 때, n번째 피보나치 수를 1234567으로
     * 나눈 나머지를 리턴하는 함수, solution을 완성하라.
     */
    int[] dp = new int[10000]; // 값 기억하기 (재귀 사용 시 시간 초과)

    public int fibo(int n) {
        if (dp[n] == -1) {
            dp[n] = (fibo(n - 1) + fibo(n - 2));
        }
        /*
         * 연산이 매우 커지기 때문에 미리 1234567으로 나누고 값 담기기
         */
        return dp[n] % 1234567;
    }

    public int solution(int n) {
        int answer = 0;

        Arrays.fill(dp, -1);
        dp[0] = 0;
        dp[1] = 1;

        answer = fibo(n);
        return answer;
    }

}
