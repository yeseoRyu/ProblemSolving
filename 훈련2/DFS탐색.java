import java.util.*;
public class DFS탐색 {
    static int[] used = new int[10];
    static int[][] map = {
        {0, 2, 6, 3, 0, 0},
        {2, 0, 7, 4, 0, 0},
        {6, 7, 0, 0, 0, 0},
        {3, 4, 2, 0, 0, 0},
        {0, 0, 1, 0, 0, 7},
        {0, 0 ,0, 0, 0, 0}
    };


    static void run(int now){
        System.out.print(now);

        for(int i = 0; i < 6; i++){
            if(map[now][i] == 0 )continue;
            if(used[i] == 1) continue;

            used[i] = 1;
            run(i);
            //used[i] = 0;
        }
    }

    public static void main(String[] args){
        run(4);
    }//main./

}