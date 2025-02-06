package UnionFind;

public class UnionFind4 {
    /*
     * 응용3) 좌표 섬 구하기
     * 
     * map에 좌표를 하나의 칸으로 볼 때
     * 맞닿으면 섬이 합쳐지고, 띄어져 있으면 개별로 인식된다.
     * 인풋A = x, 인풋B = y 라고 할 때
     * 실시간 섬의 개수를 출력하라
     */
    static int[] boss = new int[200];
    static int[][] map = new int[10][10];
    static int makeGroup;

    static int find(int n) {
        if (boss[n] == 0)
            return n;
        int ret = find(boss[n]);
        return ret;
    }

    static void setUnion(int t1, int t2) {
        int a = find(t1);
        int b = find(t2);
        if (a == b)
            return;
        boss[b] = a;
        makeGroup++;
    }

    public static void main(String[] args) {
        int[][] direct = {
                { -1, 0 }, { 1, 0 }, { 0, 1 }, { 0, -1 }
        };
        int[] inputA = { 1, 1, 2, 2, 3, 4, 2 }; // 섬 좌표
        int[] inputB = { 1, 2, 3, 4, 2, 2, 2 };

        int cnt = 0;
        for (int i = 0; i < 7; i++) {
            map[inputA[i]][inputB[i]] = ++cnt; // 들어가는 숫자 개수

            for (int t = 0; t < 4; t++) {
                int dy = inputA[i] + direct[t][0];
                int dx = inputB[i] + direct[t][1];

                if (dy < 0 || dy >= 10 || dx < 0 || dx >= 10)
                    continue;
                if (map[dy][dx] == 0) // 맞닿은 곳에 숫자 없으면 넘어감
                    continue;

                // 섬과 맞닿아 있으면 합치기
                setUnion(map[inputA[i]][inputB[i]], map[dy][dx]);
            }
            System.out.println(cnt - makeGroup);
        }
    }

}