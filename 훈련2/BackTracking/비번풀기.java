package BackTracking;

public class 비번풀기 {
    /*
     * 각 input에 적혀있는 알파벳 비번을 몇 회만에 맞출 수 있는지 출력
     * AAAA ~ ZZZZ 까지 알파벳 순서대로 시도
     */
    static String[] input = { "AAAC", "ATKC", "ZBAB" };
    static char[] pass = new char[10];
    static boolean flag = false;
    static int cnt = 0;

    static void run(int lev, String input) {
        if (flag)
            return;

        if (lev == 4) {
            cnt++;
            String temp = new String();

            for (int i = 0; i < 4; i++) {
                temp += pass[i];

                if (temp.equals(input)) {
                    flag = true;
                    return;
                }
            }
            return;
        }

        /* 시도할 알파벳 개수만큼 for 돌리기 */
        for (int i = 0; i < 26; i++) {
            pass[lev] = (char) ('A' + i);
            run(lev + 1, input);
            pass[lev] = 0;

            /*
             * 한번 시도하면 중복없이 다음 알파벳들로 넘어가야 하기 때문에
             * 갔다오면 0 으로 세팅!!
             */

        }
    }

    // 시도할 때 마다 모든 변수 초기화
    static void init() {
        cnt = 0;
        flag = false;
        pass = new char[10];
    }

    public static void main(String[] args) {
        int n = 3;

        for (int i = 0; i < n; i++) {
            init();
            run(0, input[i]);
            System.out.println(cnt);
        }
    }

}
