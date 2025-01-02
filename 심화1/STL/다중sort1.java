package STL;

public class 다중sort1{
    static int[] map = {1, 5, 4, 2, 6, 9, 7};

    static int isCompare(int a, int b){
        if(a % 2 == 1 && b % 2 == 0) return 1;  // 짝수 우선
        if(a % 2 == 0 && b % 2 == 1) return 0;
        if(a > b) return 1;                     // 오름차순
        return 0;
    }

    static void swap(int dx){
        int temp = map[dx];
        map[dx] = map[dx - 1];
        map[dx - 1] = temp;
    }

    public static void main(String[] arg){
        int n = 7;
        int[] arr = {4, 3, 2, 1, 6, 4, 5};
        int[] result = new int[n];

        int t = 1;

        for(int i = 0; i < n; i++){
            result[i] = arr[i];
            for(int x = i; x > 0; x--){
                if(isCompare(map[x - 1], map[x]) == 1){
                    swap(x);
                }
                else break;
            }
        }
        
    }// ./main()
}