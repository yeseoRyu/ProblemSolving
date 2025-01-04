import java.util.*;
public class 범인흔적 {
    static int[] evid = {-1, 0, 0, 1, 2, 4, 4};
    static int[] time = {8, 3, 5, 6, 8, 9, 10};

    static void run(int step){
        if(step == 0) {
            System.out.println(step + "번index(출발)");
            return;
        }
        run(evid[step]);
        System.out.println(step + "번index(" + time[step] + "시)");
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int step = sc.nextInt();

        run(step);

        sc.close();
    }//main./
}
