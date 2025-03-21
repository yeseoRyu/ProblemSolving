package BackTracking;

import java.util.Scanner;

public class 재귀복습 {
    static char[] path = new char[10];
    static String name;
    static int t;

    static void backTracking(int lev){
        if(lev == t){
            for(int i = 0; i < lev; i++){
                System.out.print(path[i]);
            }
            System.out.println();
            return;
        }

        for(int i = 0; i < name.length(); i++){
            path[lev] = name.charAt(i);
            backTracking(lev + 1);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        name = sc.next();
        t = sc.nextInt();

        backTracking(0);

        sc.close();
    }//main./
    
}