package 배열;
import java.util.*;
public class 정예멤버 {
    static int[][] a = {{2, 6, 3}, {7, 1, 1}, {3, 4, 2}};
    static int[][] b = {{6, 4, 2, 4}, {1, 1, 5, 8}};
    static int[][] c = {{9, 2, 3}, {4, 2, 1}};
    static int[][] result = new int[3][3];


    static int findMax(int dy, int dx, int[][] input){
        int max = 0;
        int maxY = 0;
        int maxX = 0;

        for(int y = 0; y < dy; y++){
            for(int x = 0 ; x < dx; x++){
                if(max < input[y][x]){
                    max = input[y][x];
                    maxY = y;
                    maxX = x;
                }
            }
        }
        input[maxY][maxX] = 0;
        return max;
    }

    static int findMin(int dy, int dx, int[][] input){
        int min = 9;
        int minY = 0;
        int minX = 0;

        for(int y = 0; y < dy; y++){
            for(int x = 0 ; x < dx; x++){
                if(min > input[y][x]){
                    min = input[y][x];
                    minY = y;
                    minX = x;
                }
            }
        }
        input[minY][minX] = 9;
        return min;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 3; i++){
            result[0][i] = findMax(3, 3, a);
            result[1][i] = findMin(2, 4, b);
        }
        for(int i = 0; i < 2; i++) result[2][i] = findMin(2, 3, c);
        result[2][2] = findMax(2, 3, c);
        

        for(int y = 0; y < 3; y++){
            for(int x = 0 ; x < 3; x++){
                System.out.print(result[y][x] + " ");
            }
            System.out.println();
        }

        sc.close();
    }//main./
}
