package 재귀;
import java.util.*;
public class 재귀탐색{
    static String[] name = new String[3];
    static int[] history = new int[5];

    static void run(int lev){
        if(lev == 3){
            for(int i = 0; i < 3; i++){
                System.out.print(name[history[i]] + " ");
            }
            System.out.println();
            return;
        }

        for(int i = 0; i < 3; i++){
            history[lev] = i;
            run(lev + 1);
            history[lev] = 0;
        }
    }

    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 3; i++){
            name[i] = sc.next();
        }
        run(0);
        sc.close();
    }
}