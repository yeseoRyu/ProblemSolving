import java.util.*;
public class 수학부침개 {
    static int spin(int p){
        String ps = Integer.toString(p);
        String temp = new String();
        for(int i = ps.length()-1; i>=0; i--){
            temp += ps.charAt(i);
        }
        return Integer.parseInt(temp);
    }

    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int n = sc.nextInt();

        int result = p;
        for(int i = 0 ; i < n; i++){
            int temp = result * 2;
            result = spin(temp);
        }

        System.out.println(result);
    }// ./main()
}
