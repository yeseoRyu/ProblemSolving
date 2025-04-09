package Tree_DFS;

import java.util.Scanner;

public class 인접행렬탐색 {
    /* DFS 탐색 순서 출력하기 */
    static int n;
    static int[][] map;

    static void run(int now) {
        System.out.print(now + " ");

        for (int i = 0; i < n; i++) {
            if (map[now][i] == 0)
                continue;
            run(i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        map = new int[n][n];

        for (int y = 0; y < n; y++) {
            for (int x = 0; x < n; x++) {
                map[y][x] = sc.nextInt();
            }
        }

        run(0);

        sc.close();
    }// main./
}
