package String;

import java.util.Scanner;

public class 크리스마스카드 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] card = new String[n];
        for (int i = 0; i < n; i++) {
            String input = sc.next();
            card[i] = input;
        }
        sc.close();

        int cnt = 0;
        for (int a = 0; a < n; a++) {
            for (int b = a; b < n; b++) {
                for (int c = b; c < n; c++) {
                    for (int d = c; d < n; d++) {
                        String temp = card[a];
                        temp += card[b];
                        temp += card[c];
                        temp += card[d];

                        if (temp.equals("CHRISTMAS")) {
                            cnt++;
                        }
                    }
                }
            }
        }

        System.out.println(cnt);
    }
}
