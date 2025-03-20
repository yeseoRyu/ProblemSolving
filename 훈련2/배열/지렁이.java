package 배열;
import java.util.*;
public class 지렁이 {
    static int[] map = new int[5];

    static void print(int index, int ww){
        for(int i = 0; i < 5; i++){
            if(i == index){
                System.out.print(ww);
            }else{
                System.out.print("_");
            }
        }
        System.out.println();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int index = 2;
        int ww = 2;

        map[index] = ww;

        while(true){
            if(ww == 0) {
                for(int i = 0; i < 5; i++){
                System.out.print("_");
                }
                break;
            }
            print(index++, ww--);
        }

        sc.close();
    }//main./
}
