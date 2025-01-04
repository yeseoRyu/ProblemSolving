import java.util.*;
public class 큰수대로좌표 {
    static int[] result = new int[3];
    static int maxY, maxX;

    static int maxNum(int dy, int dx, int[][] input){
        int max = 0;
        for(int y = 0; y < dy; y++){
            for(int x = 0; x < dx; x++){
                if(result[0] == input[y][x] || result[1] == input[y][x]) continue;
                if(max < input[y][x]){
                    max = input[y][x];
                    maxY = y;
                    maxX = x;
                }
            }
        }
        return max;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int dy = sc.nextInt();
        int dx = sc.nextInt();
        int[][] input = new int[dy][dx];
        for(int y = 0; y < dy; y++){
            for(int x = 0; x < dx; x++){
                input[y][x] = sc.nextInt();
            }
        }
        
        for(int i = 0; i < 3; i++){
            result[i] = maxNum(dy, dx, input);
            System.out.println(result[i] + "(" + maxY + "," +  maxX + ")");
        }

        sc.close();
    }
}
