import java.util.Scanner;

public class 배열돌리기 {
    /* 
     * n x n 배열을 k번 회전시키기(오른쪽 방향)
     */
    static int[][] turn(int n, int[][] map) {
        int[][] result = new int[n][n];

        for (int y = 0; y < n; y++) {
            for (int x = 0; x < n; x++) {
                result[x][(n - 1) - y] = map[y][x];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[][] map = new int[n][n];

        // 맵 입력
        for (int y = 0; y < n; y++) {
            for (int x = 0; x < n; x++) {
                int t = sc.nextInt();
                map[y][x] = t;
            }
        }

        int[][] temp = map.clone();

        for (int i = 0; i < k; i++) {
            temp = turn(n, temp);
        }

        for (int y = 0; y < n; y++) {
            for (int x = 0; x < n; x++) {
                System.out.print(temp[y][x] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}