import java.util.*;
public class 경로출력 {
    static int n;
    static int[][] map;
    static int[] path = new int[3];

    static void run(int lev, int now){
        if(lev == 3){
            for(int i = 0; i < 3; i++){
                System.out.print(path[i] + " ");
            }
            System.out.println();
            return;
        }

        for(int i = 0 ; i < n; i++){
            if(map[now][i] ==  0) continue;

            path[lev] = i;
            run(lev + 1, i);
            path[lev] = 0;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        map = new int[n][n];

        for(int y = 0; y < n; y++){
            for(int x = 0; x < n; x++){
                map[y][x] = sc.nextInt();
            }
        }

        run(1, 0);

        sc.close();
    }//main./

}
