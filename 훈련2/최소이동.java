import java.util.Scanner;

public class 최소이동 {
    static int[] used = new int[10];
    static int[][] map = {
        {0, 0, 1, 0, 1, 1},
        {1, 0, 0, 1, 0, 0},
        {0, 0, 0, 0, 1, 0},
        {1, 0, 0, 0, 0, 0},
        {1, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 0},
    };
    static int a, b;
    static int min = 99;
    static boolean flag = false;

    static void run(int now, int sum){
        if(now == (b-1)){
            flag = true;
            if(min > sum) min = sum;
            return;
        }

        for(int i = 0; i < 6; i++){
            if(map[now][i] == 0) continue;
            if(used[i] == 1) continue;

            used[i] = 1;
            run(i, sum + map[now][i]);
            used[i] = 0;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();

        run((a-1), 0);

        if(flag) System.out.println(min);
        else System.out.println(0);
        
        sc.close();
    }//main./
}
