import java.util.*;
public class BFS기초1 {
    public static void main(String[] args){
        ArrayList<ArrayList<Integer>> aList = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();

        for(int i = 0; i < 7; i++){
            aList.add(new ArrayList<>());
        }
        aList.get(5).add(3);
        aList.get(5).add(1);
        aList.get(3).add(2);
        aList.get(1).add(4);
        aList.get(4).add(0);
        aList.get(4).add(6);

        q.add(5);   // 최상단

        while (!q.isEmpty()) {
            //1. 큐에 뺀다 (탐색)
            int now = q.poll();
            System.out.print(now + " ");

            //2. 다음 갈 곳 예약 (큐 등록)
            // now에 해당하는 index로 탐색 -> 3, 1
            for(int i = 0; i < aList.get(now).size(); i++){
                int next = aList.get(now).get(i);
                q.add(next);
            }
        }
    }//main./
}