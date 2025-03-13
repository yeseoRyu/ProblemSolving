import java.util.Scanner;

public class 그룹핑 {
    /*
     * 입력받은 알파벳이 속한 그룹을 하나로 묶을 때,
     * 최종적으로 남아있는 그룹의 개수 출력하기
     */
    static int[] union = new int[100];
    static int[] gruop = new int[100];
    static int groupCnt = 10;

    static int find(int n) {
        if (union[n] == 0)
            return n;

        int ret = find(union[n]);
        return ret;
    }

    static void setUnion(int t1, int t2) {
        int a = find(t1);
        int b = find(t2);

        if (a == b) {
            return;
        }

        union[b] = a;
        groupCnt--;
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            gruop[i] = 1;
        }

        // 초기 세팅 (4그룹)
        setUnion(1, 2);
        setUnion(2, 3);
        setUnion(4, 5);
        setUnion(5, 6);
        setUnion(7, 8);
        setUnion(9, 10);

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String temp1 = sc.next();
            String temp2 = sc.next();

            int t1 = temp1.charAt(0) - 64;
            int t2 = temp2.charAt(0) - 64;

            setUnion(t1, t2);
        }

        sc.close();
        System.out.println(groupCnt + "개");
    }
}
