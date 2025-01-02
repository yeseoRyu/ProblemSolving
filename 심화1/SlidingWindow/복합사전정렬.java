import java.util.*;
public class 복합사전정렬 {
    static String[] map;
    
    static void swap(int dy, int dx){
        String temp = map[dy];
        map[dy] = map[dx];
        map[dx] = temp;
    }

    static void lengthSort(int n, String[] map){
        for(int y = 0; y < n - 1; y++){
            for(int x = y + 1; x < n; x++){
                if(map[y].length() > map[x].length()){
                    swap(y, x);
                }else if(map[y].length() == map[x].length()){
                    int result = map[y].compareTo(map[x]);
                    if(result > 0){
                        swap(y, x);
                    }
                }
            }
        }
    }

    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        map = new String[n];
        for(int i = 0; i < n; i++){
            map[i] = sc.next();
        }

        Arrays.sort(map);
        int d = 1;
        lengthSort(n, map);
        int dd = 1;

        for(int i = 0; i < n; i++){
            System.out.println(map[i]);
        }
    }// ./main()
}
