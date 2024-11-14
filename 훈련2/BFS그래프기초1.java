import java.util.*;
public class BFS그래프기초1 {
    static ArrayList<ArrayList<Integer>> aList = new ArrayList<>();

    static void bfs(int start){
        Queue<Integer> q = new LinkedList<>();
        int[] used = new int[10];
        String name = "ABCDE";

        q.add(start);
        used[start] = 1;    // start 시점 선정해두기

        while(!q.isEmpty()){
            int now = q.poll();
            System.out.println(name.charAt(now));

            for(int i = 0; i < aList.get(now).size(); i++){
                int next = aList.get(now).get(i);
                if(used[next] == 1) continue;

                used[next] = 1;
                q.add(next);
            }
        }
    }


    public static void main(String[] args){

        for(int i = 0 ; i < 5; i++){
            aList.add(new ArrayList<>());
        }

        aList.get(0).add(1);
        aList.get(0).add(2);
        aList.get(1).add(0);
        aList.get(1).add(2);
        aList.get(2).add(0);
        aList.get(2).add(1);
        aList.get(2).add(3);
        aList.get(3).add(2);
        aList.get(3).add(4);
        aList.get(4).add(3);

        bfs(0);

    }//main./
}
