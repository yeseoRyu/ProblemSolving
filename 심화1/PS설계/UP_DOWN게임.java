import java.util.Scanner;

public class UP_DOWN게임 {
    /*
     * n 만큼 숫자와 UP or DOWN 입력
     * 정답을 찾아내면 출력 후 게임 끝
     * 못 찾아내면 정답 범위 출력
     * 범위 벗어나면 ERROR
     */
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int start = 1;
        int end = 50;
        int num;
        String scop;

        for (int i = 0; i < n; i++) {
            num = sc.nextInt();
            scop = sc.next();

            // Valid Check
            if (scop.equals("UP") && num >= end) {
                System.out.println("ERROE");
                break;
            }
            if (scop.equals("DOWN") && num <= start) {
                System.out.println("ERROR");
                break;
            }

            // 범위 조정
            if (scop.equals("UP"))
                start = num + 1;
            if (scop.equals("DOWN"))
                end = num - 1;

            // 정답 화인
            if (start == end) {
                System.out.println(start);
                break;
            }
        }

        System.out.print((start + 1) + " ~ " + (end - 1));
        sc.close();
    }
}