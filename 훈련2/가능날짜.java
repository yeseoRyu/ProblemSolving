import java.util.*;
public class 가능날짜 {
    static int countM(String temp){
        if(temp.length() == 1 && temp.equals("X")){
            return 9;
        }else if(temp.length() == 2 && temp.contains("X")){
            return 3;
        }else return 1;
    }

    static int countD(String temp){
        if(temp.length() == 1 && temp.equals("X")){
            return 9;
        }else if(temp.length() == 2){
            if(temp.equals("XX")) return 22;
            if(temp.equals("3X")) return 2;
            if(temp.equals("1X") || temp.equals("2X")) return 10;
            if(temp.equals("X1")) return 3;
            else return 2;
        }else if(temp.length() == 2 && temp.equals("XX")){
            return 22;
        }
        return 0;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        int a = 0;
        int b = 0;
        int y = 0;
        a = input.indexOf(".");
        b = input.indexOf(".", a + 1);
        String year = input.substring(0, a);
        if(year.contains("X")){
            y = 1;
        }
        String temp = input.substring(a + 1, b);
        int m = countM(temp);
        int d = countD(input.substring(b + 1));
        int result = y + m * d;

        System.out.println(result);
        sc.close();
    }//main./
}
