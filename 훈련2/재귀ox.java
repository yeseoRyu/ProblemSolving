import java.util.*;
public class 재귀ox {
    static char[] path = new char[10];
    static String name = "ox";
    static int t;

    static void run(int lev){
        if(lev == t){
            for(int i = 0; i < lev; i++){
                System.out.print(path[i]);
            }
            System.out.println();
            return;
        }

        for(int i = 0; i < 2; i++){
            path[lev] = name.charAt(i);
            run(lev + 1);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();

        run(0);

        sc.close();
    }//main./
}
