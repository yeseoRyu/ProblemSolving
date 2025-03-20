package Tree_BSF;
import java.util.*;
public class BFS기초2 {
        /*  트리탐색
         *  A
         * -C  -B  -Q
         *     -T  -P -R
        */
        public static void main(String[] args){
            String name = "ACBQTPR";
            int[][] map = {
                {0, 1, 1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 1, 1},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0}
            };
    
            Queue<Integer> q = new LinkedList<>();
            
            q.add(0);   // 최상단
            
            while (!q.isEmpty()) {
                int now = q.poll();
                System.out.print(name.charAt(now) + " ");
    
                for(int i = 0; i < 7; i++){
                    if(map[now][i] == 0) continue;
                    q.add(i);
                }
            }
    
    
        }//main./
    } 
