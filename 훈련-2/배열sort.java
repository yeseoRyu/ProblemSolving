import java.util.*;
public class 배열sort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] map = {1, 5, 4, 2, -5, -7};
        int t = sc.nextInt();
        
        Arrays.sort(map);   // 오름차순
        int index = 6 - t;

        System.out.println(map[index]);

        sc.close();
    }//main./
}