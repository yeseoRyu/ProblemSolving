package UnionFind;

public class UnionFind5 {
    /*
     * 응용 4) CYCLE 판단
     * 그래프가 cycle 인지 확인하기 (단, 양방향 그래프일때!)
     */
    static int[] boss = new int[200];

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
    }

    public static void main(String[] args) {
        char[] inputA = { 'A', 'B', 'C', 'D' };
        char[] inputB = { 'B', 'C', 'D', 'A' };

        for (int i = 0; i < 4; i++) {
            if (find(inputA[i]) == find(inputB[i])) {
                System.out.println("CYCLE 발견");
                return;
            }
            setUnion(inputA[i], inputB[i]);
        }
    }

}
