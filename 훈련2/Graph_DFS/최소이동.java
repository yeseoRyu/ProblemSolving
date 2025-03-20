package Graph_DFS;

import java.util.Scanner;

public class 최소이동 {
    /* a에서 b까지 가는 최소 이동 횟수 */
    static int[][] map = {
            { 0, 0, 1, 0, 1, 1 },
            { 1, 0, 0, 1, 0, 0 },
            { 0, 0, 0, 0, 1, 0 },
            { 1, 0, 0, 0, 0, 0 },
            { 1, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0 }
    };
    static int[] used = new int[10];
    static int a, b;
    static int min = 99;

    static void run(int now, int sum) {
        if (now == (b - 1)) {
            if (min > sum) {
                min = sum;
            }
            return;
        }

        for (int i = 0; i < 6; i++) {
            if (map[now][i] == 0)
                continue;
            if (used[i] == 1)
                continue;

            used[i] = 1;
            run(i, sum + map[now][i]);
            used[i] = 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();

        used[a - 1] = 1;
        run(a - 1, 0);

        if (min == 99)
            min = 0;
        System.out.println(min);
    }
}
