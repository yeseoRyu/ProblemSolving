import java.util.Scanner;

public class 검색엔진 {
    /*
     * 4글자 검색어를 입력받으면
     * 해당 알파벳이 순서와 일치하는 문자열을
     * arr에 있는 몇개 해당되는지 개수 출력
     */
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        String[] arr = { "ABCD", "ABCE", "AGEH", "EIEI", "FEQE", "ABAD" };
        String input = "?B??";
        int cnt = 0;

        for (int x = 0; x < 6; x++) {
            int flag = 0;

            for (int i = 0; i < 4; i++) {
                // 검색어에 있는 알파벳이 같지 않을 경우 break;
                if (input.charAt(i) != '?' && input.charAt(i) != arr[x].charAt(i)) {
                    flag = 1;
                    break;
                }
            }

            if (flag == 0)
                cnt++;
        }

        System.out.println(cnt);
        sc.close();
    }
}