import java.util.Scanner;

public class 최대땅값 {
    static int[][] map = new int[4][8];
    /* 
     * 직사각형 모양으로 선택된 곳의 값을 모두 더했을 때,
     * 가장 최대 값 구하기
     */

    // 사각형 더하기
    static int getSum(int startY, int startX, int dy, int dx) {
        if (startY + dy > 4 || startX + dx > 8)
            return -1;
        int sum = 0;
        for (int y = startY; y < startY + dy; y++) {
            for (int x = startX; x < startX + dx; x++) {
                if (map[y][x] == 0) {
                    return -1;
                }
                sum += map[y][x];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int y = 0; y < 4; y++) {
            for (int x = 0; x < 8; x++) {
                int t = sc.nextInt();
                map[y][x] = t;
            }
        }

        int max = 0;
        for (int dy = 1; dy <= 4; dy++) {
            for (int dx = 1; dx <= 8; dx++) {

                for (int y = 0; y < 4; y++) {
                    for (int x = 0; x < 8; x++) {
                        // max = Math.max(max, getSum(y, x, dy, dx));
                    }
                }
            }
        }

        System.out.println(max);
        sc.close();
    }
}