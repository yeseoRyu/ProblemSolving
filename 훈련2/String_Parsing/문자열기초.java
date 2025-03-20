import java.util.Scanner;

public class 문자열기초 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String t = "BABBSHHRBTSJKJKAIIWE";
        
        // 1. charAt() : 문자열을 char 배열처럼 사용
        for(int i = t.length()-1; i>=0; i--){
            //System.out.print(t.charAt(i));
        }

        // 2. indexOf() : 해당 문자열을 찾아서 index 반환 (= find)
        int index = t.indexOf("BTS");
        
        // 3. 문자열 배열
        String[] stringArr = {
            "ABBT", "BTBT", "BBBT", "KFC"
        };

        String str = "AAB[VFF]SD";
        //String sbstr = str.substring(2, 4);
        int start = str.indexOf("[");
        String sbstr = str.substring(start + 1, start + 4);

        //System.out.println(sbstr);

        String str2 = new String();
        for(char i = 'A'; i <= 'Z'; i++){
            str2 += i;
        }

        String[] strarr = {"ABCQ", "B[4]R", "CCDA", "BT[15]"};
        int go, end;
        for(int i = 0; i < 4; i++){
            if(strarr[i].contains("[")){
                go = strarr[i].indexOf("[");
                end = strarr[i].indexOf("]");
                //System.out.println(strarr[i].substring(go+1, end));
            }
        }

        // 패턴 찾기
        String[] tar = {"GOLDABGOLD", "GOLDTTT", "AGGOLDGOLD", "GOLDTTT"};
        int cnt = 0;
        for(int i = 0; i < 4; i++){
            int a = -1;
            while(true){
                a = tar[i].indexOf("GOLD", a+1);
                if(a == -1)break;
                cnt++;
            }
        }

        System.out.println(cnt);

    }//main./
}