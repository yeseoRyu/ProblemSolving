package UnionFind;

public class UnionFind2 {
    /* 1, 2, 9번이 소속된 사람 수 출력 */

    static int[] boss = new int[10];
    static int[] group = new int[10];

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

        // b 그룹들이 a로 이동 --> 남아있는 수 없음
        group[a] += group[b];
        group[b] = 0;
    }

    // 해당 그룹의 보수가 가진 수 리턴
    static int getCount(int n) {
        int t = find(n);
        return getCount(t);
    }

    public static void main(String[] args) {
        setUnion(1, 3);
        setUnion(4, 2);
        setUnion(9, 5);
        setUnion(1, 3);
        setUnion(1, 9);

        for (int i = 0; i < 10; i++) {
            group[i] = 1;
        }

        System.out.println(getCount(1));
        System.out.println(getCount(2));
        System.out.println(getCount(9));
    }
    
}
