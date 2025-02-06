package UnionFind;

import java.util.ArrayList;
import java.util.Collections;

class Node {
    char a;
    char b;
    int price;

    public Node(char a, char b, int price) {
        this.a = a;
        this.b = b;
        this.price = price;
    }
}

public class UnionFind6 {
      /*
     * 응용4) MST(최소 신장 트리) 알고리즘
     * 그래프에서 최단 거리 구하기
     * 
     * 각 알파벳들이 연결되어 있고, 연결 통로마다 번호가 있을 때,
     * 모든 알파벳이 연결될 수 있는 경로 중에 가장 최소값을 구하라.
     */
    static int[] boss = new int[200];
    static ArrayList<Node> nodeList = new ArrayList<Node>();

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
        String inputA = "AABBACEE";
        String inputB = "BCCDDDDC";
        int[] input = { 3, 5, 2, 1, 15, 2, 3, 6 };
        int n = input.length;

        for (int i = 0; i < input.length; i++) {
            nodeList.add(new Node(inputA.charAt(i), inputB.charAt(i), input[i]));
        }

        // 1. sort --> 최소순으로 정렬하기
        for (int y = 0; y < n; y++) {
            for (int x = 0; x < n; x++) {
                if (nodeList.get(y).price < nodeList.get(x).price) {
                    Collections.swap(nodeList, y, x);
                }
            }
        }

        // 2. 채택
        int cnt = 0;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int a = nodeList.get(i).a;
            int b = nodeList.get(i).b;
            int price = nodeList.get(i).price;

            // 같은 그룹일 경우 CYCLE 이므로 넘어가기
            if (find(a) == find(b))
                continue;
            setUnion(a, b);

            // 모든 알파벳이 연결된다면
            if (cnt == 4)
                break;

            // 경로 통과
            sum += price;
        }

        System.out.println(sum); // 정답 9
    }

}
