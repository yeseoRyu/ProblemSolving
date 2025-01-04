import java.util.*;
public class 문자열노드 {
    static int[][] map = new int[8][8];
    static String name = new String();

    static void run(int now){
        System.out.print(name.charAt(now));

        for(int i = 0; i < 8; i++){
            if(map[now][i] == 0) continue;
            run(i);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        name = sc.next();

        for(int y = 0; y < 8; y++){
            for(int x = 0; x < 8; x++){
                map[y][x] = sc.nextInt();
            }
        }

        run(0);

        sc.close();
    }//main./
}
