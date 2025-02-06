package UnionFind;

import java.util.Scanner;

public class Cycle찾기 {
    /*
     * 입력된 알파벳 두 쌍이 노드로 연결된다고 할 때,
     * Cycle이 있는 그래프인지 아닌지 판별하기기
     */
    static int[] union = new int[200];

    static int find(int n) {
        if (union[n] == 0)
            return n;

        int ret = find(union[n]);
        return ret;
    }

    static void setUnion(int t1, int t2) {
        int a = find(t1);
        int b = find(t2);

        if (a == b)
            return;
        union[b] = a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int flag = 0;
        for (int i = 0; i < n; i++) {
            String tempA = sc.next();
            String tempB = sc.next();

            int a = find(tempA.charAt(0));
            int b = find(tempB.charAt(0));

            if (a == b) {
                flag = 1;
                break;
            }
            setUnion(a, b);
        }

        if (flag == 1) {
            System.out.println("발견");
        } else {
            System.out.println("미발견");
        }

        sc.close();
    }

}
