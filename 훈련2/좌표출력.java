import java.util.*;
public class 좌표출력{
    static int[] used = new int[10];
    static int[] path = new int[3];
    static int min = 999;

    static void run(int lev, int n, int[] input){
        if(lev == 3){
            String temp = new String();
            for(int i = 0; i < 3; i++){
                temp += path[i];
            }
            int result = Integer.parseInt(temp);
            if(result >= 100 && result < min){
                min = Integer.parseInt(temp);
            }
            return;
        }

        for(int i = 0; i < n; i++){
            if(used[i] == 1) continue;
            used[i] = 1;
            path[lev] = input[i];
            run(lev + 1, n, input);
            used[i] = 0;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] input =  new int[n];

        for(int i = 0; i < n; i++){
            input[i] = sc.nextInt();
        }

        run(0, n, input);

        System.out.println(min);
        sc.close();
    }
}