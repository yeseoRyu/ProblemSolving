import java.util.*;
public class Math {
    public static int parsingInt(String temp){
        if(temp.contains(("-"))){
            String t = temp.substring(1);
            int ti = Integer.parseInt(t);
            return -ti;
        }else if(temp.contains("+")){
            String t = temp.substring(1);
            return Integer.parseInt(t);
        }else{
            return Integer.parseInt(temp);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String temp = new String();
        int a = -1;
        int b = 0;
        int sum = 0;

        for(int i = 0; i < input.length(); i++){
            if(i == input.length()-1){
                temp = input.substring(b);
                sum += parsingInt(temp);
            }
            if(input.charAt(i) < '0' || input.charAt(i) > '9'){
                a = input.indexOf(input.charAt(i), a + 1);
                temp = input.substring(b, a);
                sum += parsingInt(temp);
                b = a;
            }
        }

        System.out.println(sum);
        sc.close();
    }//main./
}
