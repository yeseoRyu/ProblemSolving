import java.util.Scanner;

public class char뒤집기 {
    static char[][] arr = {
            { 'A', 'B', 'C', 'E', 'F', 'G' },
            { 'H', 'I', 'J', 'K', 'L', 'M' },
            { 'N', 'O', 'P', 'Q', 'R', 'S' }
    };
    static int[][] dir = { { 0, -1 }, { 0, 1 }, { -1, 0 }, { 1, 0 }, { 0, 0 } };
    static char[][] result = new char[3][6];

    // 1 문자열 찾기
    static void search(char t) {
        for (int y = 0; y < 3; y++) {
            for (int x = 0; x < 6; x++) {
                if (arr[y][x] == t)
                    turn(y, x);
            }
        }
    }

    // 2 뒤집기
    static void turn(int ty, int tx) {
        for (int y = 0; y < 5; y++) {
            int dy = ty + dir[y][0];
            int dx = tx + dir[y][1];
            if (dy < 0 || dy >= 3 || dx < 0 || dx >= 6)
                continue;

            if (result[dy][dx] != '#') {
                result[dy][dx] = '#';
            } else {
                result[dy][dx] = arr[dy][dx];
            }
        }
    }

    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        String input = "BE";
        for (int y = 0; y < 3; y++) {
            for (int x = 0; x < 6; x++) {
                result[y][x] = arr[y][x];
            }
        }

        for (int i = 0; i < input.length(); i++) {
            search(input.charAt(i));
        }

        for (int y = 0; y < 3; y++) {
            for (int x = 0; x < 6; x++) {
                System.out.print(result[y][x]);
            }
            System.out.println();
        }
        sc.close();
    }
}