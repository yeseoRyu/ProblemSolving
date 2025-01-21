import java.util.Arrays;
import java.util.Scanner;

public class 회원아이디{
    /* 회원 아이디 규칙
     * 첫 글자 대문자, 나머지 소문자 --> 정상
     * 모두 소문자 --> 첫 글자 대문자, 나머지 소문자자
     * 그 밖에 대소문자 섞임 --> 모두 대문자
     */
    static String changeID(String name){
        int cnt = 0;
        for(int i = 0; i < name.length(); i++){
            if(name.charAt(i) >= 'A' && name.charAt(i) <= 'Z'){
                cnt++;
            }
        }

        if(name.charAt(0) >= 'A' && name.charAt(0) <= 'Z' && cnt == 1){
            return name;
        }else if (cnt == 0){
            char ch = Character.toUpperCase(name.charAt(0));
            String st = name.substring(1);
            String re = Character.toString(ch) + st;
            return re;
        }else{
            String st = new String();
            for(int x = 0; x < name.length(); x++){
                char ch = Character.toUpperCase(name.charAt(x));
                st += ch;
            }
            return st;
        }
    }

    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] name = new String[n];
        
        for(int i = 0; i < n; i++){
            String t = sc.next();
            name[i] = t;
        }

        for(int i = 0; i < n; i++){
            name[i] = changeID(name[i]);
        }

        Arrays.sort(name);
        for(int i = 0; i < n; i++){
            System.out.println(name[i]);
        }
    }   
}