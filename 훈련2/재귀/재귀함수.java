package 재귀;
import java.util.*;
public class 재귀함수 {
    static char[] card = {'O', 'X'};
    static char[] path = new char[3];


    static void print(char[] path){
        int win = 0;
        int lose = 0;
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < 3; i++){
            if(path[i] == 'O'){
                win++;
                sb.append("승");
            }
            if(path[i] == 'X') {
                lose++;
                sb.append("패");
            }
        }
        if(win > 0){
            System.out.print(win + "승");
        }
        if(lose > 0){
            System.out.print(lose + "패");
        }

        System.out.print("(" + sb.toString() + ")\n");
    }

    static void run(int lev){
        if(lev == 3){
            print(path);

            return;
        }

        for(int i = 0; i < 2; i++){
            path[lev] = card[i];
            run(lev + 1);
            path[lev] = 0;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        run(0);
        
        sc.close();
    }//main./
}
