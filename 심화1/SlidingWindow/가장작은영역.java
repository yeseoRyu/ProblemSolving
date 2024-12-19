import java.util.*;
public class 가장작은영역{
    
    static int getSum(int[] arr){
        int sum = 0;
        for(int i = 0; i < 4; i++){
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int sum = getSum(arr);
        int min = 999;

        int limit = n - 4;
        for(int i = 0; i <= limit; i++){
            if(sum < min) min = sum;

            if(i == limit) break;

            sum -= arr[i];
            sum += arr[i + 4];
        }

        System.out.println(min);
    }// ./main()
}