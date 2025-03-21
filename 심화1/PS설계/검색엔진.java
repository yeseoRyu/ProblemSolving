public class 검색엔진 {

     /* 검색되는 단어 개수 출력 */
    static int solution(String[] map, String input) {
        int cnt = 0;

        for (int i = 0; i < map.length; i++) {
            String t = map[i];
            int flag = 0;

            for (int x = 0; x < 4; x++) {
                if (input.charAt(x) != '?' && input.charAt(x) != t.charAt(x)) {
                    flag = 1;
                    break;
                }
            }

            if (flag == 0) {
                cnt++;
            }
        }

        return cnt;
    }

    public static void main(String[] args) {
        String[] map = {
                "ABCD", "ABCE", "AGEH", "EIEI", "FEQE", "ABAD"
        };
        String input = "?B??";

        System.out.println(solution(map, input));
    }
}