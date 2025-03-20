package 배열;
import java.util.*;
public class 네모블럭돌리기 {
    static public int isSame(int[][] a, int[][] b){
        for(int y = 0; y < 3; y++){
            for(int x = 0; x < 3; x++){
                if(a[y][x] != b[y][x]) return 0;
            }
        }
        return 1;
    }

    static int[][] turn(int[][] a){
        int[][] temp = new int[3][3];

        for(int i = 0; i < 3; i++){
            temp[0][i] = a[0][i];
            temp[1][i] = a[1][i];
            temp[2][i] = a[2][i];
        }

        for(int i = 0; i < 3; i++){
            a[0][i] = temp[i][2];
            a[1][i] = temp[i][1];
            a[2][i] = temp[i][0];
        }
        return a;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[3][3];
        int[][] b = new int[3][3];
        int cnt = 0;
        for(int y = 0; y < 3; y++){
            for(int x = 0; x < 3; x++){
                a[y][x] = sc.nextInt();
            }
        }
        for(int y = 0; y < 3; y++){
            for(int x = 0; x < 3; x++){
                b[y][x] = sc.nextInt();
            }
        }

        while (true) {
            int flag = isSame(a, b);
            if(flag == 1) break;
            a = turn(a);
            cnt++;
        }

        System.out.println(cnt);

        sc.close();
    }//main./
}
