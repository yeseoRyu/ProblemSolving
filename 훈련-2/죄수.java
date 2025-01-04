import java.util.*;
public class 죄수 {
    static String input;


    static int getAlph(int a){
        for(int i = a; i < input.length(); i++){
            if(input.charAt(i) >= 'A' && input.charAt(i) <= 'Z'){
                return i;
            }
        }
        return -1;
    }

    static int getNum(int b){
        for(int i = b; i < input.length(); i++){
            if(input.charAt(i) >= '0' && input.charAt(i) <= '9'){
                return i;
            }
        }
        return 0;
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        input = sc. next();
        String tempAlph = new String();
        String tempNum = new String();
        int a = -1;
        int b = 0;

        while(true){
            int d = 1;

            a = getAlph(b);
            if(a == -1) {
                tempNum = input.substring(b);
                int tn = Integer.parseInt(tempNum);
                System.out.print(tn+17);
                System.out.println();
                break;
            }
        
            if(a > b){
                tempNum = input.substring(b, a);
                int tn = Integer.parseInt(tempNum);
                System.out.print(tn+17);
                System.out.println();
            }

            b = getNum(a+1);
            tempAlph = input.substring(a, b);
            System.out.print(tempAlph + "#");
        }

            

        System.out.println();
        sc.close();
    }//main./
}
