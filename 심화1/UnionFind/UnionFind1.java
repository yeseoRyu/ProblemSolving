package UnionFind;

public class UnionFind1 {
    /* <Union-Find> 기본 개념 */
    static int[] boss = new int[10];

    // n의 보스 찾기
    static int find(int n) {
        if (boss[n] == 0)
            return n;

        int ret = find(boss[n]);    // 재귀
        boss[n] = ret;              // 보스 바로 밑으로 나열(경로 압축)
        return ret;
    }

    static void setBoss(int t1, int t2) {
        int a = find(t1);
        int b = find(t2);

        if (a == b)     // 둘의 보스가 같다면 (같은 그룹이라면) 필요 X
            return;
        boss[b] = a;    // t2의 보스가 t1의 보스 밑으로 그룹핑
    }

    public static void main(String[] args) {
        setBoss(5, 6);
        setBoss(6, 7);
        setBoss(1, 2);

        String result = new String();

        if (find(5) == find(6)) {
            result = "같다";
        } else {
            result = "다름";
        }

        System.out.println(result);
    }

}