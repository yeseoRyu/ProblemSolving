import java.util.*;
/* 노드를 연결하는 가중치 값을 누적하며,
 * 입력된 번호부터 깊이 우선 탐색하기 */
public class 가중치인접행렬DFS {
    static int[][] map = {
        {0, 0, 1, 0, 2, 0},
        {5, 0, 3, 0, 0, 0},
        {0, 0, 0, 0, 0, 7},
        {2, 0, 0, 0, 8, 0},
        {0, 0, 9, 0, 0, 0},
        {4, 0, 0, 7, 0, 0}
    };
    static int[] used = new int[10];
    static int sum = 0;

    static void dfs(int now){
        System.out.println(now + " " + sum);

        for(int i = 0; i < 6; i++){
            if(map[now][i] ==  0) continue;
            if(used[i] == 1) continue;

            used[i] = 1;
            sum += map[now][i];
            dfs(i);
        }
    };

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        
        used[start] = 1;
        dfs(start);

        sc.close();
    }//main./
}
