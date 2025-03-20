package 재귀;
import java.util.*;
/* 자전거 암호풀기 */
public class 비번풀기 {
    static String name = new String();
    static String[] path = new String[30];
    static String[] passInput;
    static int index = 0;
    static int cnt = 0;
    static int t;

    static void run(int lev){
        if(lev == 4){
            cnt++;
            String temp = new String();
            for(int i = 0; i < 4; i++){
                temp += path[i];    // 재귀들 시도
            }
            String pass = passInput[index];
            if(temp.equals(pass)){
                System.out.println(cnt);
                if(index < t-1){
                    index ++;
                }
            }

            return;
        }

        for(int i = 0; i < 26; i++){
            path[lev] = String.valueOf(name.charAt(i));
            run(lev + 1);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        passInput = new String[t];
        
        for(int i = 0; i < t; i++){
            passInput[i] = sc.next();
        }

        char temp = 'A';
        for(int i = 0; i < 26; i++){
            name += String.valueOf(temp);
            temp++;
        }

        run(0);
            
        sc.close();
    }//main./
}