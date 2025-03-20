package 배열;
import java.util.*;
public class 움직이는알파 {
    static char[][] map = new char[4][3];
    static int[][] direct = {
        {0, 1}, {1, 0}, {0, -1}, {-1, 0}, {0, 1}
    };
    static int cnt = 0;
    static int dy, dx;
    
    static void search(int index){
        for(int y = 0; y < 4; y++){
            for(int x = 0; x < 3; x++){
                if(index == (int)map[y][x]){
                    dy = y;
                    dx = x;
                }
            }
        }
    }

    static void move(int dy, int dx){
        int ddy = dy + direct[cnt][0];
        int ddx = dx + direct[cnt][1];
        if(ddy < 0 || ddy >= 4 || ddx < 0 || ddx >= 3) return;
        if(map[ddy][ddx] != '_') return;
        char temp = map[dy][dx];
        map[dy][dx] = map[ddy][ddx];
        map[ddy][ddx] = temp;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> index = new ArrayList<>();

        for(int y = 0; y < 4; y++){
            String str = sc.next();
            for(int x = 0; x < 3; x++){
                map[y][x] = str.charAt(x);
            }
        }

        for(int y = 0; y < 4; y++){
            for(int x = 0; x < 3; x++){
                if(map[y][x] >= 65 && map[y][x] <= 90){
                    index.add((int)map[y][x]);
                }
            }
        }
        
        // index 정렬
        Collections.sort(index);
        for(int x = 0; x < 5; x++){
            for(int i = 0; i < index.size(); i++){
                search(index.get(i));
                move(dy, dx);
            }
            cnt++;
        }

        for(int y = 0; y < 4; y++){
            for(int x = 0; x < 3; x++){
                System.out.print(map[y][x]);
            }
            System.out.println();
        }

        sc.close();
    }//main./
}

