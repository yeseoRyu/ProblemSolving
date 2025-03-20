package Tree_BSF;

import java.util.LinkedList;
import java.util.Queue;

public class Queue기초1 {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();
        q.add("A9");
        q.add("B7");
        q.add("Q5");
        q.add("T4");

        while (!q.isEmpty()) {
            // 첫 번째 값을 반환하고 제거
            System.out.println(q.poll());
        }
    }// main./
}