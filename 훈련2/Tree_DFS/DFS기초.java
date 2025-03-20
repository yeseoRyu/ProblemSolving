package Tree_DFS;
import java.util.*;
public class DFS기초 {
    static String name = "ABTQVX";
    static ArrayList<int[]> arr = new ArrayList<>(6);

    
    static void run(int now){
        System.out.print(name.charAt(now));
        

        int[] temp = arr.get(now);
        for(int i = 0; i < temp.length; i++){
            int next = temp[i];
            run(next);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        arr.add(new int[]{1, 2, 3});
        arr.add(new int[]{4, 5});
        arr.add(new int[]{});
        arr.add(new int[]{});
        arr.add(new int[]{});
        arr.add(new int[]{});

        run(0);

        sc.close();
    }//main./

}