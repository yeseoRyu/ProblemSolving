import java.util.*;
public class 같은단어찾기 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> strList = new ArrayList<>();
        String a = sc.next();
        String b = sc.next();
        int al = a.length()-1;
        int bl = b.length()-1;

        for(int y = 0; y <= al; y++){
            for(int x = 0; x <= bl; x++){
                if(a.charAt(y) == b.charAt(x)){
                    // 다음 문자열 비교
                    StringBuffer sb = new StringBuffer();
                    int dy = y;
                    int dx = x;
                    
                    while (true) {
                        if(dx > bl || dy > al) break;
                        char t = a.charAt(dy++);
                        char t2 = b.charAt(dx++);
                        if(t != t2) break;
                        sb.append(t);
                    }
                    if(sb.length()>1){
                        strList.add(sb.toString());
                    }
                }
            }
        }

        int max = 0;
        int maxIndex = 0;
        for(int i = 0; i < strList.size(); i++){
            int temp = strList.get(i).length();
            if(temp > max){
                max = temp;
                maxIndex = i;
            }
        }

        System.out.println(strList.get(maxIndex));
        
        sc.close();
    }//main./
}
