public class 문자열합치기{
    static String[] map = {"HITS",  "HI", "HITSM", "MUSIC",  "SMU", "SIC",  "USIC"};
    static int n = 7;
    
    public static void main(String[] arg){
        String sum = new String();
        int cnt = 0;
        
        for(int y = 0; y < n - 1; y++){     // 처음부터 마지막에서 하나 전까지
            for(int x = y + 1; x < n; x++){ // 앞 글자(y) 다음 것부터 마지막까지
                sum = map[y] + map[x];      // String은 그냥 더해서 합쳐지는 게 된다
                if(sum.equals("HITSMUSIC")) cnt++;
            }
        }
        
        System.out.println(cnt);
    }// ./main()
}