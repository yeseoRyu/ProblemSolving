public class 슬라이딩윈도우5{
    public static void main(String[] arg){
        /* 특정 구간 안에 가장 많이 빈출하는 알파벳 구하기 */
        String arr = "BAQRRGGVAQZAACT";
        int[] dat = new int[100];

        int max = 0;
        char maxCh = ' ';

        /* 초기값 세팅 */
        for(int i = 0; i < 5; i++){
            dat[arr.charAt(i)]++;

            if(dat[arr.charAt(i)] > max){
                max = dat[arr.charAt(i)];
                maxCh = arr.charAt(i);
            }
        }

        for(int i = 0; i < arr.length() - 5; i++){
            /* 슬라이딩 처리 */
            dat[arr.charAt(i)]--;
            dat[arr.charAt(i + 5)]++;

            // 신규 추가된 것을 상대로 max 갱신
            if(dat[arr.charAt(i + 5)] > max){
                max = dat[arr.charAt(i + 5)];
                maxCh = arr.charAt(i + 5);
            }
        }

        System.out.println(maxCh);
    }// ./main()
}