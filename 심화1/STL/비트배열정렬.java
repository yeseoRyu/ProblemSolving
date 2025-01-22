import java.util.ArrayList;
import java.util.Collections;

public class 비트배열정렬 {
    static int check(int a, int b){
        if(a < b) return 1;
        return 0;
    }

    public static void main(String[] arg){
        int n = 6;
        int[][] num = {
            {1, 1, 1, 1, 1, 1},
            {2, 2, 2, 2, 2, 2},
            {3, 3, 3, 3, 3, 3},
            {6, 6, 6, 6, 6, 6},
            {7, 7, 7, 7, 7, 7},
            {8, 8, 8, 8, 8, 8}
        };
        int[][] bit = {
            {0, 1, 1, 0, 0, 0},
            {1, 1, 0, 0, 0, 0},
            {1, 1, 0, 0, 0, 0},
            {1, 1, 0, 1, 0, 0},
            {1, 1, 0, 1, 0, 0},
            {1, 1, 0, 1, 0, 0}
        };
        /* bit 에 해당하는 숫자 sort
         * 1. 빈도수 높을 수록 우선순위
         * 2. 오름차순
         */

        ArrayList<Integer> tar = new ArrayList<>();
        int[] used = new int[10];

        for(int y = 0; y < n; y++){
            for(int x = 0; x < n; x++){
                if(bit[y][x] == 1){
                    tar.add(num[y][x]);
                    used[num[y][x]]++;
                }
            }
        }
        Collections.sort(tar);

        for(int i = 0; i < tar.size() - 1; i++){
            for(int x = i + 1; x < tar.size(); x++){
                if(check(used[tar.get(i)], used[tar.get(x)]) == 1){
                    int d = tar.get(x);         // 집어 넣을 수
                    int len = used[tar.get(x)]; // 빈도 횟수

                    for(int t = 0; t < len; t++){
                        tar.remove(x++);    // 나갈 자리 차례로 제거
                        tar.add(i, d);      // 들어갈 자리 추가(index 자동 밀림)
                    }
                }
            }
        }

        for(int i = 0; i < tar.size(); i++){
            System.out.print(tar.get(i) + " ");
        }
    }
}