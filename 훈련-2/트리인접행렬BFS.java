import java.util.*;
public class 트리인접행렬BFS {
    static int[][] map = new int[6][6];

    static void bfs(int start){
        Queue<Integer> q = new LinkedList<>();
        q.add(start);

        while(!q.isEmpty()){
            int now = q.poll();
            System.out.print(now + " ");

            for(int i = 0; i < 6; i++){
                if(map[now][i] == 0) continue;
                q.add(i);
            }
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        map[0][1] = 1;
        map[0][4] = 1;
        map[1][2] = 1;
        map[1][5] = 1;
        map[2][3] = 1;

        bfs(start);

        sc.close();
    }//main./
}
