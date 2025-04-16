package Graph_DFS;

import java.util.Scanner;

public class 최소이동 {
    /*
     * a --> b 최소 이동 횟수
     * 그래프 탐색 시 Cycle로 인한 무한 재귀 막기
     * --> used 배열 사용
     * 모든 경로 탐색 - 방문 후 기록 지우기
     * 모든 노드 탐색 - 방문 전 기록 (후에 지우지 않음)
     */
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
    static int min = 999;

    static void run(int now, int sum) {
        if (now == (b)) {
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
            used[i] = 0; /* 모든 경로 탐색이므로 기록 지우기 */
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt() - 1;
        b = sc.nextInt() - 1;

        used[a] = 1; /* 출발 선 표시해두기 */
        run(a, 0);

        if (min == 99)
            min = 0;
        System.out.println(min);
    }
}
