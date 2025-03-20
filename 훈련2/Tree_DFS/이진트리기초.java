package Tree_DFS;
import java.util.*;

public class 이진트리기초 {
    static String name = "ABTQVX";
    static ArrayList<int[]> arr = new ArrayList<>();

    // DFS
    static void run(int now){
        System.out.print(name.charAt(now));

        for(int i = 0; i < arr.get(now).length; i++){
            if(arr.get(now)[i] == 0) continue;
            int next = arr.get(now)[i];
            run(next);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // 이진 트리
        arr.add(0, new int[]{1, 2, 3, 0, 0, 0});
        arr.add(1, new int[]{4, 5, 0, 0, 0, 0});
        arr.add(2, new int[]{0, 0, 0, 0, 0, 0});
        arr.add(3, new int[]{0, 0, 0, 0, 0, 0});
        arr.add(4, new int[]{0, 0, 0, 0, 0, 0});
        arr.add(5, new int[]{0, 0, 0, 0, 0, 0});

        run(0);

        sc.close();
    }//main./

}
