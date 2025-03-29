package 문제풀이모음.Programmers.Lv_2;

import java.util.Arrays;

public class 최솟값만들기 {
    /*
     * 길이가 똑같은 두 배열의 요소를 나란히 곱한 값을 누적할 때,
     * 나올 수 있는 최솟값을 구하여라.
     */
    public int solution(int[] A, int[] B) {
        int answer = 0;
        int n = B.length;

        Arrays.sort(A);
        Arrays.sort(B);

        for (int i = 0; i < B.length; i++) {
            answer += A[i] * B[--n];
        }

        return answer;
    }
    
}
