import java.util.*;

public class 자리찾기 {
    static int[] map = new int[8];
    static int pivot;
    static int indexA, indexB;

    public static void search(){
        for(int i = 1; i < 8; i++){
            if(map[i] > pivot){
                indexA = i;
                break;
            }
        }
        for(int i = 7; i > 0; i--){
            if(map[i] < pivot){
                indexB = i;
                break;
            }
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 8; i++) map[i] = sc.nextInt();
        pivot = map[0];
        search();

        for(int i = 0; i < 4; i++){
            if(indexA < indexB){
                int temp = map[indexA];
                map[indexA] = map[indexB];
                map[indexB] = temp;
    
                search();
            }else{
                int temp = map[0];
                map[0] = map[indexB];
                map[indexB] = temp;
                break;
            }
        }

        for(int i = 0; i < 8; i++){
            System.out.print(map[i] + " ");
        }
        sc.close();
    }
}