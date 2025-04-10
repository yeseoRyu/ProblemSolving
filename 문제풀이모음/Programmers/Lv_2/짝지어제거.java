import java.util.Stack;

class 짝지어제거 {
    /*
     * 문자열 s가 주어질 때, 같은 알파벳이 맞닿으면 제거
     * 모두 제거될 수 있게 짝지어진 문자열일 경우 1, 아닐 경우 0 리턴하라.
     * O(n), n <= 1,000,000
     */
    public int solution(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            /*
             * 스택이 비어있지 않을 때, peek 하여 문자 비교
             * 같으면 pop으로 없앰
             */
            if (!stack.isEmpty() && stack.peek() == s.charAt(i)) {
                stack.pop();

            } else {
                /*
                 * 연속되지 않은 문자들은 스택에 쌓임
                 */
                stack.push(s.charAt(i));
            }
        }

        if (stack.size() == 0)
            /*
             * 스택이 비어있으면 모두 연속된 것.
             */
            return 1;
        else
            return 0;
    }

}