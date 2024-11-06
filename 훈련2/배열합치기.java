import java.util.*;
public class 배열합치기 {
    static int[] t1 = new int[4];
    static int[] t2 = new int[4];
    static int a = 0;
    static int b = 0;

    static int getVal(){
        int result = 0;
        if(a >= 4) return t2[3];
        if(b >= 4) return t1[3];

        if(t1[a] <= t2[b]){
            result = t1[a];
            a++;

        }else if(t2[b] <= t1[a]){
            result = t2[b];
            b++;
        }
        return result;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] resutl = new int[8];

        
        for(int i = 0; i < 8; i++){
            if(i < 4){
                t1[i] = sc.nextInt();
            }else{
                t2[i-4] = sc.nextInt();
            }
        }

        for(int i = 0; i < 8; i++){
            resutl[i] = getVal();
            System.out.print(resutl[i] + " ");
        }

        sc.close();
    }//main./
}