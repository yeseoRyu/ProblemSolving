package 배열;
import java.util.*;
public class 블럭굴리기 {
    static int[][] map = {{0, 5, 4}, {3, 0, 0}, {0, 0, 1}};
    static int[][] result = new int[3][3];
    
    static void turn(){
        for (int y = 0; y < 3; y++) {
            for (int x = 0; x < 3; x++) {
                result[x][2-y] = map[y][x];
            }
        }
    }

    static void copy(){
        for (int y = 0; y < 3; y++) {
            for (int x = 0; x < 3; x++) {
                map[y][x] = result[y][x];
            }
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i = 0; i < t; i++){
            turn();
            copy();
        }
        
        for (int y = 0; y < 3; y++) {
            for (int x = 0; x < 3; x++) {
                if(result[y][x] == 0) System.out.print('_');
                else System.out.print(result[y][x]);
            }
            System.out.println();
        }

        sc.close();
    }//main./
}
