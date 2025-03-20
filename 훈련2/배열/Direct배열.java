package 배열;
import java.util.Scanner;

public class Direct배열 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] map = {
                { "BHC", "BBQ", "KFC" },
                { "MC", "7AVE", "PAPA" },
                { "DHC", "OBS", "MOMS" }
        };
        int[][] dir = {
                { -1, 0 }, { 0, -1 }, { 1, 0 }, { 0, 1 }
        };
        int ty, tx;
        ty = sc.nextInt();
        tx = sc.nextInt();

        for (int y = 0; y < 4; y++) {
            int dy = ty + dir[y][0];
            int dx = tx + dir[y][1];
            if (dx < 0 || dx >= 3 || dy < 0 || dy >= 3)
                continue;
            System.out.print(map[dy][dx]);
        }

        sc.close();
    }
}
