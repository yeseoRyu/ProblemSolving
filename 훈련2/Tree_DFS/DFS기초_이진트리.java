package Tree_DFS;
import java.util.*;

public class DFS기초_이진트리 {
    static char[] vect = new char[100];

    static void run(int now){
        if(vect[now] == 0) return;

        System.out.print(vect[now]);

        run(now*2);
        run(now*(2+1));
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        vect[1] = 'A';
        vect[2] = 'B';
        vect[3] = 'T';
        vect[4] = 'R';
        vect[5] = 'S';
        vect[6] = 'V';

        run(1);
        sc.close();
    }//main./

}