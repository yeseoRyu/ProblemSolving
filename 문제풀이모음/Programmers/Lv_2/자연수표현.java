package 문제풀이모음.Programmers.Lv_2;

public class 자연수표현 {
    static public int solution(int n) {
        int answer = 0;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum = 0;

            for (int x = i; x <= n; x++) {
                sum += x;

                if (sum == n) {
                    answer++;
                    break;
                }

                if (sum > n) {
                    break;
                }
            }
        }

        return answer;
    }

    static public void main(String[] args) {
        System.out.println(solution(3));
    }

}
