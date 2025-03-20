package 배열;
import java.util.*;
public class 톱니바퀴 {
    static int[][] map = {
        {3, 2, 5, 3},
        {7, 6, 1, 6},
        {4, 9, 2, 7}
    };

    static void turn(int n, int dx){
        // 각 4번 호출
        for(int i = 0; i < n; i++){
            int temp1 = map[0][dx];
            int temp2 = map[1][dx];

            map[0][dx] = map[2][dx];
            map[1][dx] = temp1;
            map[2][dx] = temp2;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 4; i++){
            int t = sc.nextInt();
            turn(t, i);
        }

        for(int y = 0; y < 3; y++){
            for(int x = 0; x < 4; x++){
                System.out.print(map[y][x]);
            }
            System.out.println();
        }


        sc.close();
    }//main./

}