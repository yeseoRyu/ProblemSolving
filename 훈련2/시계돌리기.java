import java.util.*;
public class 시계돌리기 {
    static int[][] clock = new int[3][3];
    static int[][] dir = {{0, 1}, {1, 0}, {2, 1}, {1, 2}};
    
    static void turn(){
        int temp = clock[0][1];

        for(int i = 0; i < 3; i++){
            int dy = dir[i][0];
            int dx = dir[i][1];
            int ty = dir[i+1][0];
            int tx = dir[i+1][1];
            clock[dy][dx] = clock[ty][tx];
        }
        clock[1][2] = temp;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int cos = sc.nextInt();
        clock[0][1] = 12;
        clock[1][0] = 9;
        clock[1][2] = 3;
        clock[2][1] = 6;

        int t = cos/90;
        while (true) {
            if(t == 0) break;
            turn();
            t--;
        }

        System.out.print(clock[0][1] + " ");
        System.out.print(clock[1][0] + " ");
        System.out.print(clock[1][2] + " ");
        System.out.print(clock[2][1] + " ");
        sc.close();
    }//main./
}