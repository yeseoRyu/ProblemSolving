import java.util.Scanner;

/* 시작점을 입력받고 방향키에 따라 움직인다
 * 5번 index인 # 지점에 도착하면 역순으로 index 경로 출력
 */
public class 방향재귀 {
    static int[] map = { 3, 2, 1, 3, 2, 0, 1 };
    static char[] dir = { '>', '>', '<', '>', '<', '#', '<' };

    static void run(int input) {
        char c = dir[input];

        if (c == '#') { // 도착
            System.out.println(input + "번");
            return;
        }
        if (c == '>') { // 오른쪽 이동
            run(input + map[input]);
        }
        if (c == '<') { // 왼쪽 이동
            run(input - map[input]);
        }

        System.out.println(input + "번");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        run(start);
        sc.close();
    }
}