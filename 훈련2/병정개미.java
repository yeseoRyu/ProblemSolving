import java.util.*;
public class 병정개미 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] map = new int[4][4];

        for(int y = 0; y < 4; y++){
            for(int x = 0; x < 4; x++){
                map[y][x] = sc.nextInt();
            }
        }

        int flag = 0;
        for(int y = 0; y < 4; y++){
            for(int x = 0; x < 4; x++){
                if(map[y][x] == 1 && (x+1) <= 3 && map[y][x+1] == 1){
                    flag = 1;
                    break;
                }
            }
        }

        if(flag == 1) System.out.println("위험한 상태");
        else System.out.println("안전한 상태");
        sc.close();
    }//main./
}
