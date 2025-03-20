package Tree_DFS;

public class 보스부하 {

    public static void main(String[] args) {
        /* 0번 노드에 해당하는 부모노드와 자식노드 출력 */
        int[][] map = {
                { 0, 0, 0, 0, 1, 0, 1 },
                { 0, 0, 0, 0, 0, 1, 0 },
                { 1, 1, 0, 1, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0 }
        };
        int n = 7;

        // 보스
        for (int i = 0; i < n; i++) {
            if (map[i][0] == 0)
                continue;
            System.out.println("boss:" + i);
        }

        // 부하
        System.out.print("under:");
        for (int i = 0; i < n; i++) {
            if (map[0][i] == 0)
                continue;
            System.out.print(i + " ");
        }
    }

}
