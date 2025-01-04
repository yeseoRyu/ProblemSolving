import java.util.*;
public class 징검다리 {
    static int[] map = {3, 1, 2, 1, 3, 2, 1, 2, 1};
    static int cnt = 0;

    static void run(int step){
        if(step > 8){
            System.out.print("도착 ");
            return;
        }

        System.out.print(map[step] + " ");
        run(step + map[step]);
        System.out.print(map[step] + " ");

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        System.out.print("시작 ");
        run(t-1);
        System.out.print("시작 ");

        sc.close();
    }//main./
}
