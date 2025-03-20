package 배열;
import java.util.*;
public class x끼리같은지 {
    static int[][] map = new int[3][3];

    static void check(int y){
        for(int x = 0; x < 2; x++){
            if(map[y][x] != map[y][x+1]){
                System.out.println("x");
                return;
            }
        }
        System.out.println(map[y][y]);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        for(int y = 0; y < 3; y++){
            for(int x = 0; x < 3; x++){
                map[y][x] = sc.nextInt();
            }
        }

        for(int y = 0; y < 3; y++){
            check(y);
        }

        sc.close();
    }//main./

}