import java.util.*;

public class ScannerStringToChar {
    static char[][] map = {
        {'A', 'B', 'C', 'D'},
        {'B', 'B', 'A', 'B'},
        {'C', 'B', 'A', 'C'},
        {'B', 'A', 'A', 'A'}
    };
    static char[][] input = new char[4][4];
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] dat = new int[100];

        
        for(int y = 0; y < 4; y++){
            String row = sc.next(); // 한 줄씩 입력하기

            for(int x = 0; x < 4; x++){
                input[y][x] = row.charAt(x);
            }
        }
        sc.close();

        for(int y = 0; y < 4; y++){
            for(int x = 0; x < 4; x++){
                if(map[y][x] == input[y][x]){
                    dat[map[y][x]]++;
                }
            }
        }

        int max = 0;
        char maxVal = ' ';
        for(int i = 65; i < 100; i++){
            if(max < dat[i]){
                max = dat[i];
                maxVal = (char)i;
            }
        }
        System.out.println(maxVal);
    }
}