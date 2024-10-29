import java.util.*;
public class 노드 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] map = new int[n][n];

        sc.nextLine();  // 개행 문자 제거

        for(int y = 0; y < n; y++){
            for(int x = 0; x < n; x++){
                map[y][x] = sc.nextInt();
            }
        }

        int boss = 0;
        int[] under = new int[5];
        int t = 0;
        
        // 타겟이 노드 0인데

        for(int y = 0; y < n; y++){
            for(int x = 0; x < n; x++){
                if(y == 0 && map[y][x] == 1){
                    int d = 1;
                    under[t++] = x;

                    // 무한 루프같음
                }
                if(x == 0 && map[y][x] == 1){
                    boss = y;
                }
            }
        }


        System.out.println("boss:" + boss);
        System.out.print("under:");
        for(int i = 0; i < 5; i++){
            if(under[i] != 0){
                System.out.print(under[i] + " ");
            }
        }
        sc.close();
    }//main./
}
