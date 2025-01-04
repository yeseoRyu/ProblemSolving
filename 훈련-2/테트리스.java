import java.util.*;
public class 테트리스 {
    static int[][] map = new int[5][4];

    static void swap(int y){
        for(int i = 0; i < 4; i++){
            map[y][i] = 0;
        }
        if(y > 0){
            for(int i = 0; i < 4; i++){
                int temp = map[y][i];
                map[y][i] = map[y-1][i];
                map[y-1][i] = temp;
            }
        }else if(y == 0){
            for(int i = 0; i < 4; i++){
                int temp = map[y][i];
                map[y][i] = map[y+1][i];
                map[y+1][i] = temp;
            }
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        for(int y = 0; y < 5; y++){
            for(int x = 0; x  < 4; x++){
                map[y][x] = sc.nextInt();
            }
        }

        for(int y = 0; y < 5; y++){
            int cnt = 0;
            for(int x = 0; x < 4; x++){
                if(map[y][x] == 1) cnt++;
                if(cnt == 4) swap(y);
            }
        }

        for(int y = 0; y < 5; y++){
            for(int x = 0; x  < 4; x++){
                System.out.print(map[y][x] + " ");
            }
            System.out.println();
        }

        sc.close();
    }//main./
}
