package Tree_BSF;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class 인접리스트 {
     static ArrayList<ArrayList<Integer>> alist = new ArrayList<>(5);

    static void bfs(int start) {
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(start);

        while (!q.isEmpty()) {
            int now = q.poll();
            System.out.print(now + " ");

            for (int i = 0; i < alist.get(now).size(); i++) {
                int next = alist.get(now).get(i);
                q.add(next);
            }
        }
    }

    public static void main(String[] args) {
        alist.add(new ArrayList<>(Arrays.asList(1, 4)));
        alist.add(new ArrayList<>(Arrays.asList(2, 5)));
        alist.add(new ArrayList<>(Arrays.asList(3)));
        alist.add(new ArrayList<>());
        alist.add(new ArrayList<>());
        alist.add(new ArrayList<>());

        bfs(0);
    }
}
