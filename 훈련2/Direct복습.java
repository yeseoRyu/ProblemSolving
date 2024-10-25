import java.util.*;
public class Direct복습 {
    static char[][] map = new char[4][4];
    static int[][] dir = {{-1, -1}, {-1, 0}, {-1, 1}, {0, 1}, {0, -1}, {1, -1}, {1, 0}, {1, 1}};


    static void direct(int yy, int xx){
        for(int y = 0; y < 8; y++){
            int dy = yy + dir[y][0];
            int dx = xx + dir[y][1];
            if(dy < 0 || dy >=4 || dx < 0 || dx >= 4) continue;
            map[dy][dx] = '@';
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int y, x;
        for(int i = 0; i < 3; i++){
            y = sc.nextInt();
            x = sc.nextInt();
            map[y][x] = '#';
        }

        for(y = 0; y < 4; y++){
            for(x = 0; x < 4; x++){
                if(map[y][x] == '#'){
                    int d = 1;

                    direct(y, x);
                }
            }
        }

        for(y = 0; y < 4; y++){
            for(x = 0; x < 4; x++){
                if(map[y][x] != '\0') System.out.print(map[y][x]);
                else System.out.print("_");
            }
            System.out.println();
        }

        sc.close();
    }//main./
}
