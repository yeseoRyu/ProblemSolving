package Graph_구현;
import java.util.*;
public class 인접행렬 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<int[]> map = new ArrayList<>();
        String[] cast = {"Chloe", "Diane", "Bob", "Amy", "Edger"};
        int[] row0 = {0, 0, 1, 0, 0};
        int[] row1 = {0, 0, 1, 0, 0};
        int[] row2 = {0, 0, 0, 1, 0};
        int[] row3 = {0, 0, 0, 0, 1};
        int[] row4 = {0, 0, 0, 0, 0};
        Collections.addAll(map, row0, row1, row2, row3, row4);

        int max = 0;
        int maxRow = 0;
        for(int x = 0; x < 5; x++){
            int cnt = 0;
            for(int y = 0; y < 5; y++){
                if(map.get(y)[x] == 1) cnt ++;
            }
            if(max < cnt){
                max = cnt;
                maxRow = x;
            }
        }

        System.out.println(cast[maxRow]);

        sc.close();
    }//main./
}
