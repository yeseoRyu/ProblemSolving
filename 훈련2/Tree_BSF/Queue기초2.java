package Tree_BSF;

import java.util.LinkedList;
import java.util.Queue;

public class Queue기초2 {
    public static void main(String[] args){

        Queue<Integer> q = new LinkedList<>();
        q.add(5);
        q.add(4);
        q.add(3);

        for(int i = 0; i < 5; i++){
            int temp = q.peek();
            int t = (temp*55+17)%11;
            q.poll();
            q.add(t);
        }

        while (!q.isEmpty()) {
            System.out.println(q.poll());
        }

    }//main./
}
