public class 슬라이딩윈도우2{
    public static void main(String[] arg){
        String path = "ABABTABCABABAACD";
        int cnt = 0;

        StringBuilder tar = new StringBuilder();
        int limit = path.length() - 3;
        tar.append("ABA");

        for(int i = 0; i < limit; i++){
            if(tar.toString().equals("ABA")) cnt++;
            if(i == limit) break;

            tar.deleteCharAt(0);
            tar.append(path.charAt(i + 3));
        }

        System.out.println(cnt);
    }
}