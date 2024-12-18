public class 슬라이딩윈도우1{
    static int[] v = {4, 5, 1, 1, 5, 4, -3, -13, 9, 20, 13};

    static int getSum(int index){
        int sum = 0;
        for(int i = 0; i < 5; i++){
            sum += v[i + index];
        }
        return sum;
    }

    public static void main(String[] arg){
        int max = 0;
        int maxIndex = 0;
        int sum = getSum(0);

        /* v size - slide size */
        for(int i = 0; i <= 11 - 5; i++){
            if (sum > max){
                max = sum;
                maxIndex = i;
            }

            /* 바운더리 처리 */
            if(i == 11 - 5) break;
            
            /* 다음 것 미리 준비 */
            sum -= v[i];
            sum += v[i + 5];
        }

        System.out.println(maxIndex);
    }
}