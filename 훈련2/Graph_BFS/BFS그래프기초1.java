package Graph_BFS;

import java.util.*;

public class BFS그래프기초1 {
    static ArrayList<ArrayList<Integer>> aList = new ArrayList<>();

    static void bfs(int start) {
        Queue<Integer> q = new LinkedList<>();
        int[] used = new int[10];
        String name = "ABCDE";

        q.add(start);
        used[start] = 1; // start 시점 선정해두기

        while (!q.isEmpty()) {
            int now = q.poll();
            System.out.println(name.charAt(now));

            for (int i = 0; i < aList.get(now).size(); i++) {
                int next = aList.get(now).get(i);
                if (used[next] == 1)
                    continue;

                used[next] = 1;
                q.add(next);
            }
        }
    }

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            aList.add(new ArrayList<>());
        }

        aList.add(new ArrayList<>(Arrays.asList(1, 2)));
        aList.add(new ArrayList<>(Arrays.asList(0, 2)));
        aList.add(new ArrayList<>(Arrays.asList(0, 1, 3)));
        aList.add(new ArrayList<>(Arrays.asList(2, 4, 3)));

        bfs(0);

    }// main./
}
