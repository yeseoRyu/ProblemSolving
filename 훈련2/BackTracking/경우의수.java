package BackTracking;

import java.util.Scanner;

public class 경우의수 {
    static int n;
    static int cnt = 0;
    static int[] used = new int[10];

    static void run(int lev) {
        if (lev == 3) {
            cnt++;
            return;
        }

        for (int i = 0; i < n; i++) {
            if (used[i] == 1)
                continue;
            used[i] = 1;
            run(lev + 1);
            used[i] = 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        run(0);
        System.out.println(cnt);

        sc.close();
    }// main./
}
