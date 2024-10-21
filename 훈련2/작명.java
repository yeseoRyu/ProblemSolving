import java.util.*;
public class 작명 {
    static int isValid(String input){
        int[] used = new int[200];
        for(int i = 0; i < input.length(); i++){
            used[input.charAt(i)]++;
            if(used[input.charAt(i)] > 2) return 0;

            if(!('a' <= input.charAt(i) && 'z' >= input.charAt(i))){
                return 0;
            }
            if(used['a'] + used['e'] + used['i'] + used['o'] + used['u'] > 3) return 0;
        }
        return 1;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] input = new String[n];
        
        for(int i = 0; i < n; i++){
            input[i] = sc.next();
        }
    

        int flag = 0;
        for(int i = 0; i < n; i++){
            flag = isValid(input[i]);
            if(flag == 1) System.out.println("good");
            else System.out.println("no");
        }

        sc.close();
    }//main./
}
