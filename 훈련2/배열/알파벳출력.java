package 배열;
import java.util.*;

public class 알파벳출력 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char[] used = new char[100];
        String input = sc.next();

        for(int i = 0 ; i < input.length(); i++){
            used[input.charAt(i)]++;
        }

        int cnt = 0;
        for(int i = 0 ; i < 100; i++){
            if(used[i] > 0) cnt++;
        }

        System.out.println(cnt + "종류");

        sc.close();
    }//main./

}
