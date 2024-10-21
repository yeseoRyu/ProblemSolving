import java.util.*;
public class 괄호 {
    static String input;
    static int n;
    static int result;

    static int start(int a){
        for(int i = a; i < n; i++){
            if(input.charAt(i) == '['){
                return i;
            }else if(input.charAt(i) == '{'){
                return i;
            }
        }
        return 0;
    }

    static int end(int b){
        for(int i = b; i < n; i++){
            if(input.charAt(i) == ']'){
                return i;
            }else if(input.charAt(i) == '}'){
                return i;
            }
        }
        return 0;
    }

    static void cal(int a, int b){
        String temp = input.substring(a + 1, b);
        int t = Integer.parseInt(temp);
        if(input.charAt(a) == '['){
            result += t;
        }else if(input.charAt(a) == '{'){
            result *= t;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        input = sc.next();
        n = input.length();
        
        int a = -1;
        int b = 0;
        int d = 1;
        while(true){
            a = start(a + 1);
            if(a == 0) break;
            b = end(b + 1);
            cal(a, b);
        }

        System.out.println(result);
        sc.close();
    }//main./
}
