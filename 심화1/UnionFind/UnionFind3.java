package UnionFind;

public class UnionFind3 {
    /* 응용 2) 그룹 개수 */
    static int[] boss = new int[10];
    static int[] isNew = new int[10];
    static int perCount = 0; // 등장인물 수
    static int makeGroup = 0; // 그룹핑 횟수

    static int find(int n) {
        if (boss[n] == 0)
            return n;

        int ret = find(boss[n]);
        return ret;
    }

    static void setUnion(int t1, int t2) {
        if (isNew[t1] == 0) {
            perCount++;
            isNew[t1] = 1;
        }
        if (isNew[t2] == 0) {
            perCount++;
            isNew[t2] = 1;
        }

        int a = find(t1);
        int b = find(t2);
        if (a == b)
            return;

        boss[b] = a;
        makeGroup++;
    }

    public static void main(String[] args) {
        setUnion(1, 3);
        setUnion(4, 2);
        setUnion(9, 5);
        setUnion(1, 3);
        setUnion(1, 9);

        /*
         * 총 숫자 개수에서 그룹핑 횟수를 빼면 정답
         * (초기에는 개개인이 한 그룹이기 때문에)
         */
        int result = perCount - makeGroup;
        System.out.println(result); // 정답 : 2
    }

}
