import java.util.*;
public class 큰수찾기2진수 {
    static String check(ArrayList<String> strList){
        String maxVal = strList.get(0);
        for(int x = 1; x < strList.size(); x++){
            int a = 0;
            int b = 0;
            
            for(int i = 0; i < maxVal.length(); i++){
                int d = 1;
                a += Integer.parseInt(String.valueOf(maxVal.charAt(i)));
                b += Integer.parseInt(String.valueOf(strList.get(x).charAt(i)));
                if(b > a){
                    maxVal = strList.get(x);
                    break;
                } 
            }
        }
        return maxVal;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> strList = new ArrayList<>();
        String[] input = new String[3];

        for(int i = 0; i < 3; i++){
            input[i] = sc.next();
        }
        // 1) 크기 비교하기
        // 2) 1이 더 먼저인 것
        int max = 0;
        for(int i = 0; i < input.length; i++){
            if(max < input[i].length()){
                max = input[i].length();
            }
        }
        int d = 1; 
        
        for(int i = 0; i < input.length; i++){
            if(max == input[i].length()){
                strList.add(input[i]);
            }
        }

        String result = strList.get(0);
        if(strList.size() > 1){
            result = check(strList);
        }
        System.out.println(result);
        sc.close();
    }//main./
}
