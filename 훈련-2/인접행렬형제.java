import java.util.*;
public class 인접행렬형제 {
    static String fam = "ABHCDGEF";
    static int[][] map = new int[8][8];

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        map[0] = new int[]{0, 1, 1, 1, 0, 0, 0, 0}; // A
        map[3] = new int[]{0, 0, 0, 0, 1, 1, 1, 0}; // C
        map[4] = new int[]{0, 0, 0, 0, 0, 0, 0, 1}; // D

        String input = sc.next();
        char t = input.charAt(0);
        int dx = 0;

        for(int i = 0; i < 8; i++){
            if(fam.charAt(i) == t){
                dx = i; // 2
                break;
            }
        }
        
        int[] temp = new int[7];
        int n = 0;
        for(int x = 0; x < 8; x++){
            if(x == dx) continue;
            for(int y = 0; y < 8; y++){
                if(y >= dx) break;
                if(map[y][x] == 1){
                    temp[n++] = x;
                }
            }
        }

        if(temp[0] == 0) System.out.println("없음");
        else{
            for(int y = 0; y < 8; y++){
                if(temp[y] == 0) break;
                int tar = temp[y];
                System.out.print(fam.charAt(tar) + " ");
            }
        }
        

        sc.close();
    }//main./

}