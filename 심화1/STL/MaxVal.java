import java.util.Arrays;
import java.util.Scanner;

public class MaxVal{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int n = sc.nextInt();

        char[] card = new char[input.length()];
        for(int i = 0; i < input.length(); i++){
            card[i] = input.charAt(i);
        }

        Arrays.sort(card);
        char[] result = new char[n];
        int[] used = new int[100];
        
        int cnt = 0;
        int len = input.length() - n;

        for(int i = input.length() - 1; i >= len; i--){
            result[cnt++] = card[i];
        }
        
        int max = 0;
        char maxVal = ' ';

        for(int i = 0; i < n; i++){
            used[result[i]]++;

            if(used[result[i]] > max){
                max = used[result[i]];
                maxVal = result[i];
            }
        }

        System.out.println(maxVal);
    }   
}