package 문제풀이모음.Programmers.Lv_2;

public class 올바른괄호 {
    /*
     * ()() 또는 (()) 등의 문자가 주어질 때,
     * () 가 반드시 짝지어져 있어야 한다.
     */
    boolean solution(String s) {
        boolean answer = true;
        int a = -1;
        int b = -1;

        while (true) {
            a = s.indexOf("(", a + 1);
            b = s.indexOf(")", b + 1);

            if (a > b) {
                answer = false;
                break;
            }

            if (a == -1 && b == -1)
                break;

            if (a == -1 || b == -1) {
                answer = false;
                break;
            }
        }

        return answer;
    }
}
