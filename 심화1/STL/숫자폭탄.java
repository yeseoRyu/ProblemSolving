import java.util.ArrayList;
import java.util.Collections;

public class 숫자폭탄{
    static void pang(ArrayList<Integer> result, int last){
        for(int i = 0; i < 3; i++){
            result.remove(last - i);
        }
    }

    public static void main(String[] arg){
        int n = 17;
        int[] vect = {5, 4, 5, 1, 1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 3, 8, 1};
        ArrayList<Integer> tong = new ArrayList<>();

        for(int i = 0; i < n; i++){
            tong.add(vect[i]);

            int tn = tong.size() - 1;
            if(tn > 2){
                int a = tong.get(tn);
                int b = tong.get(tn - 1);
                int c = tong.get(tn - 2);

                if(a == b && b == c){
                    pang(tong, tn);
                }
            }
        }

        Collections.sort(tong);
        for(int i = 0; i < tong.size(); i++){
            System.out.print(tong.get(i) + " ");
        }
    }
}