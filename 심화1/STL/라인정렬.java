import java.util.*;

public class 라인정렬 {
    public static void main(String[] arg){
        ArrayList<ArrayList<Integer>> arr = new ArrayList();
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 5; i++){
            ArrayList<Integer> list = new ArrayList<>();
            String input = sc.next();
            
            for(int x = 0; x < input.length(); x++){
                list.add(Integer.parseInt(String.valueOf(input.charAt(x))));
            }
            arr.add(list);
        }
        
        int line1 = sc.nextInt(); 
        int line2 = sc.nextInt();

        int d  =1; 

        Collections.sort(arr.get(line1));
        Collections.sort(arr.get(line2));

        for(int i = 0; i < 5; i++){
            System.out.print(arr.get(i).get(0) + " ");
        }
    }   
}
