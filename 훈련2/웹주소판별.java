import java.util.*;
public class 웹주소판별 {
    static int isVal(String temp2){
        String[] vect = {".com", ".co.kr", ".org", ".net"};
        int flag = 0;

        for(int y = 0; y < 4; y++){
            StringBuilder sb = new StringBuilder();
            if(temp2.length() < vect[y].length()) continue;
            for(int x = 0; x < vect[y].length(); x++){
                sb.append(temp2.charAt(x));
            }
            String temp = sb.toString();
            if(temp.equals(vect[y])) {
                flag = 1;
                break;
            };
        }
        return flag;
    }

    static int isValid(String str){
        int a = -1;
        int b = -1;
        a = str.indexOf("//", a + 1);
        b = str.indexOf(".", b + 1);

        String temp1 = str.substring(a + 2, b);
        if(temp1.length() < 3 || temp1.contains("/") || temp1.contains(".")) return 0;
        String temp2 = str.substring(b);
        return isVal(temp2);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = "https://https://https://ABC.co.kr.comhttps://BBQ.com.com.com.org";
        String str = input.toLowerCase();

        int a = -1;
        int b = -1;
        int result = 0;

        while(true){
            a = str.indexOf("http://", a + 1);

            if(a == -1) break;
            if(a > 0){
                result += isValid(str.substring(a));
            }
        }
        
        while(true){
            b = str.indexOf("https://", b + 1);
            if(b == -1) break;

            if(b > 0){
                result += isValid(str.substring(b));
            }
        }

        System.out.println(result + "개");
        sc.close();
    }//main./
}
