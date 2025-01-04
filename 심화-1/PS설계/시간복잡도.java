import java.util.*;
public class 시간복잡도 {
    /* 각 함수의 시간 복잡도 계산하기 */
    static Scanner sc = new Scanner(System.in);

    static void Number1(){
        for (int i = 0; i < 10000; i++) {
            System.out.print("#");
        }
    }
    /*-- 특정횟수 반복하는 for문 --*/
    /* O(1) */

    static void Number2(){
        int n = sc.nextInt();

        for (int y = 0; y < n; y++) {
            for (int x = 0; x <= y; x++) {
                System.out.print("#");
            }
        }
    }
    /*-- n번 반복하는 2중 for문 --*/
    /* O(N^2) */

    static void Number3(){
        int n = sc.nextInt();
        for (int y = 0; y < n; y++) {
            abc(n);
            abc(n);
            abc(n);
        }       
    }
    
    static void abc(int n){
        for (int i = 0; i < n; i++) {
            System.out.print("#");
        }
    }
    /*-- n번 반복하는 2중 for문 --*/
    /* O(N^2) */
    
    static void Number4(){
        int n = sc.nextInt();

        for (int y = 0; y < n; y++) {
            for (int x = 0; x < 5; x++) {
                for (int z = 0; z < n; z++) {
                    System.out.print("#");
                }
            }
        }
    }
    /*-- 3중 for문 --*/
    /* n번 반복은 2중 -- 그 사이 for문은 특정 횟수만큼 반복 (1)
       O(N^2) */

    public static void main(String[] arg){
        int n = sc.nextInt();
        int retult = 0;

        switch (n) {
            case 1: retult = 21; break;
            case 2: retult = 2; break;
            case 3: retult = 2; break;
            case 4: retult = 2; break;
        }

        System.out.println(retult);
    }// ./main()
}