package BackTracking;

import java.util.Scanner;

public class 조합 {
    static int[] input = new int[5];
    static int[] used = new int[5];
    static int cnt;

    static void run(int lev, int n, int index){
        if(lev == n){
            int sum = 0;
            for(int i = 0; i < 5; i++){
                if(used[i] == 1){
                    sum += input[i];
                }
            }
            if(sum >= 10 && sum <= 20){
                cnt++;
            }
            return;
        }

        for(int i = index; i < 5; i++){
            if(used[i] == 1) continue;
            used[i] = 1;
            run(lev + 1, n, i);
            used[i] = 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 5; i++){
            input[i] = sc.nextInt();
        }

        for(int i = 0; i < 5; i++){
            run(0, i, 0);
        }

        System.out.println(cnt);

        sc.close();
    }
}
