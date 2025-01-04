import java.util.*;
/* 입력받은 숫자부터 깊이 우선 탐색으로 방문하는 노드 값 출력 */
/* 입력 : 0
   출력 : 0 2 4 5 3 */
public class 인접행렬그래프DFS {
    static int[][] map = {
        {0, 0, 1, 1, 0, 1},
        {0, 0, 0, 1, 1, 1},
        {0, 0, 0, 0, 1, 1},
        {0, 0, 0, 0, 0, 0},
        {1, 0, 0, 0, 0, 1},
        {0, 0, 0, 0, 0, 0}
    };
    static int[] used = new int[10];

    // 깊이 우선 탐색
    static void dfs(int now){
        System.out.print(now + " ");

        for(int i = 0; i < map[now].length; i++){
            if(map[now][i] == 0) continue;
            if(used[i] == 1) continue;

            used[i] = 1;
            dfs(i);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        used[t] = 1;
        dfs(t);
    }//main./
}