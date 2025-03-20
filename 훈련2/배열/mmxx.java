package 배열;
import java.util.*;
public class mmxx {
    static int[] number = new int[6];
    static int[] copy = new int[10];
    static String command = new String();
    static int r;

    static int find(char input){
        // 일단 제일 작은 수
        int m = 9;
        int x = 0;
        
        for(int i = 0; i < 6; i++){
            
            if(input == 'm'){
                if(number[i] < m){
                    if(copy[number[i]] > 0) continue;
                    m = number[i];
                    r = m;
                }

            }else{
                if(number[i] > x){
                    if(copy[number[i]] > 0) continue;
                
                    x = number[i];
                    r = x;
                }
            }
        }
        return r;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 6; i++){
            number[i] = sc.nextInt();
        }
        command = sc.next();
        
        for(int i = 0; i < 6; i++){
            int r = find(command.charAt(i));
            System.out.print(r);
            copy[r]++;
        }

        sc.close();
    }//main./
}
