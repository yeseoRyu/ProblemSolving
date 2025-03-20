package Graph_BFS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class 그래프경로출력 {
    static ArrayList<ArrayList<Integer>> alist = new ArrayList(6);

    static void bfs(int start) {
        Queue<Integer> q = new LinkedList<Integer>();
        int[] used = new int[10];
        used[start] = 1;
        q.add(start);

        while (!q.isEmpty()) {
            int now = q.poll();
            System.out.println(now);

            for (int i = 0; i < alist.get(now).size(); i++) {
                int next = alist.get(now).get(i);
                if (used[next] == 1)
                    continue;

                used[next] = 1;
                q.add(next);
            }
        }
    }

    public static void main(String[] args) {
        alist.add(new ArrayList<Integer>(Arrays.asList(4)));
        alist.add(new ArrayList<Integer>(Arrays.asList(0, 2, 5)));
        alist.add(new ArrayList<Integer>(Arrays.asList(0, 3)));
        alist.add(new ArrayList<Integer>(Arrays.asList(0, 1)));
        alist.add(new ArrayList<Integer>(Arrays.asList(1, 3, 5)));
        alist.add(new ArrayList<Integer>(Arrays.asList(2, 3)));
        bfs(0);
    }

}
