import java.util.*;
import java.util.Vector;

public class 벡터기초 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Vector<Integer> vec = new Vector<>();
        int n = sc.nextInt();
        String[] input = new String[n];
        int[] compo = new int[n];

        for(int i = 0; i < n; i++){
            input[i] = sc.next();

            if(input[i].equals("push")){
                int t = sc.nextInt();
                vec.add(t);

            }else if(input[i].equals("printLast")){
                System.out.println(vec.get(vec.size()-1));

            }else if(input[i].equals("pop")){
                vec.remove(vec.size()-1);
            }    
        }

        sc.close();
    }//main./

}