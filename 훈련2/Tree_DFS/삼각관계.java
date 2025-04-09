package Tree_DFS;

public class 삼각관계 {
    /* 가장 인기있는 사람 이름 출력 */
    public static void main(String[] args) {
        int[][] map = {
                { 0, 0, 0, 0, 1 },
                { 1, 0, 0, 0, 0 },
                { 0, 1, 0, 0, 0 },
                { 0, 1, 0, 0, 0 },
                { 0, 0, 0, 0, 0 }
        };
        String[] name = { "Amy", "Bob", "Chole", "Diane", "Edger" };
        int maxY = 0;

        for (int x = 0; x < 5; x++) {
            int cnt = 0;

            for (int y = 0; y < 5; y++) {
                if (map[y][x] == 0)
                    continue;
                cnt++;
            }
            if (maxY < cnt)
                maxY = x;
        }

        System.out.println(name[maxY]);
    }
}
