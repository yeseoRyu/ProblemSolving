package Tree_DFS;
import java.util.*;
public class 트리인접행렬DFS{
    static int[][] map = new int[6][6];
    static int[] used = new int[6];
    static String name = "ABCDEF";

     // 리프 노드 확인 메서드
    public static boolean isLeafNode(int[][] graph, int node) {
        for (int i = 0; i < graph.length; i++) {
            if (graph[node][i] == 1) {
                return false;
            }
        }
        return true;
    }

    static void run(int lev){
        for(int i = 0; i < 6; i++){
            if(map[lev][i] == 0) continue;
            if(used[i] == 1) continue;
            used[i] = 1;

            run(i);

            if(isLeafNode(map, i)){
                for(int y = 0; y < 6; y++){
                    if(used[y] == 1) {
                        System.out.print(name.charAt(y));
                    }
                }
                System.out.println();
            }
            used[i] = 0;
        }
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        for(int y = 0; y < 6; y++){
            for(int x = 0; x < 6; x++){
                map[y][x] = sc.nextInt();
            }
        }
        used[0] = 1;
        run(0);
    }
}