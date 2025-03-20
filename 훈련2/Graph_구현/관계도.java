package Graph_구현;
import java.util.Scanner;
public class 관계도 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String t = "ABCD";
        int[][] map = new int[4][4];

        for(int y = 0; y < 4; y++){
            for(int x = 0; x < 4; x++){
                map[y][x] = sc.nextInt();
            }
        }

        int mx = 0;
        char pop = ' ';

        for(int x = 0; x < 4; x++){
            int cnt = 0;
            for(int y = 0; y < 4; y++){
                if(map[y][x] == 1) cnt++;
            }
            if(mx < cnt){
                mx = cnt;
                pop = t.charAt(x);
            }
        }

        System.out.println(Character.toString(pop));

        sc.close();
    }//main./

}
