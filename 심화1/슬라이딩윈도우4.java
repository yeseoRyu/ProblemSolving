public class 슬라이딩윈도우4{
    /* 합이 7이 나오는 가장 긴 구간 찾기 */
    static int[] arr = {4, 5, 6, 1, 1, 3, 2, 6, 9, 1, 1, 2, 0, 3, 2};
    
    static int isSeven(int size){
        /* 초기값 설정 */
        int sum = 0;
        for(int i = 0; i < size; i++){
            sum += arr[i];
        }

        int limit = arr.length - size;
        
        /* 슬라이딩윈도우 */
        for(int i = 0; i <= limit; i++){
            if(sum == 7) return 1;
            
            if(i == limit) break;

            sum -= arr[i];
            sum += arr[i + size];
        }

        return 0;
    }

    /* 가장 긴 길이부터 찾기 */
    static void result(){
        for(int i = arr.length; i >=0; i--){
            int ret = isSeven(i);
            if(ret == 1){
                System.out.println(i);
                return;
            }
        }
        System.out.println("없음");
    }

    public static void main(String[] arg){
        result();
    }// ./main()
}