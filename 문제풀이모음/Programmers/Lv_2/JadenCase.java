package 문제풀이모음.Programmers.Lv_2;

public class JadenCase {
    public String solution(String s) {
        String answer = "";
        String low = s.toLowerCase();
        boolean flag = true;
        int cnt = 0;

        for (int i = 0; i < s.length(); i++) {
            char t = low.charAt(i);

            if (t == ' ') {
                cnt = 0;
                flag = true;
            }

            if (flag && cnt < 2) {
                if (t >= 'a' && t <= 'z') {
                    t = (char) (t - 32);
                    flag = false;
                }
            }

            answer += t;
            if (i == 0) {
                flag = false;
            }
            cnt++;
        }

        return answer;
    }
}
