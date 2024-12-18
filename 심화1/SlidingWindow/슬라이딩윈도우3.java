public class 슬라이딩윈도우3{
    public static void main(String[] arg){
        String path = "ABBABQAADAA";
        int[] dat = new int[100];
        int max = 0;

        /* 초기값 설정 */
        for(int i = 0; i < 4; i++){
            dat[path.charAt(i)]++;
        }

        int limit = path.length() - 4;
        for(int i = 0; i < limit; i++){
            if(dat['A'] > max) max = dat['A'];

            if(i == limit) break;

            /* 다음것 준비 */
            dat[path.charAt(i)]--;
            dat[path.charAt(i + 4)]++;
        }

        System.out.println(max);
    }// ./main()
}