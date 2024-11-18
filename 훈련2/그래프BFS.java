import java.util.*;
public class 그래프BFS {
    static ArrayList<ArrayList<Integer>> map = new ArrayList<>();
    
    static void bfs(int start){
        Queue<Integer> q = new LinkedList<>();
        int[] used = new int[10];
        q.add(start);
        used[start] = 1;

        while (!q.isEmpty()) {
            int now = q.poll();
            System.out.println(now);

            for(int i = 0; i < map.get(now).size(); i++){
                int next = map.get(now).get(i);
                if(used[next] == 1) continue;
                used[next] = 1;
                q.add(next);
            }
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        
        for(int i = 0; i < 6; i++){
            map.add(new ArrayList<>());
        }
        map.get(0).add(4);
        map.get(1).add(0);
        map.get(1).add(2);
        map.get(1).add(5);
        map.get(2).add(0);
        map.get(2).add(3);
        map.get(3).add(0);
        map.get(3).add(1);
        map.get(4).add(1);
        map.get(4).add(3);
        map.get(4).add(5);
        map.get(5).add(2);
        map.get(5).add(3);
        
        bfs(start);
        sc.close();
    }//main./
}
