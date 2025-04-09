package Tree_DFS;

public class Lev2경로출력 {
    /* 주어진 트리에서 2층에 도착시 경로 출력 */
    static int n;
    static int[][] map;
    static int[] path = new int[10];

    // 층(lev)과 노드 번호(now)를 따로 관리하기!
    static void dfs(int lev, int now) {
        if (lev == 2) {
            for (int i = 0; i <= 2; i++) {
                System.out.print(path[i] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            if (map[lev][i] == 0)
                continue;

            path[lev + 1] = i;
            dfs(lev + 1, i);
            path[lev + 1] = 0;
        }
    }

    public static void main(String[] args) {
        dfs(0, 0);
    }
}
