import java.util.*;
public class String배열줄변경 {
    
    static void swap(String[] map){
        for(int y = 0; y < 5; y++){
            char[] tempChar = map[y].toCharArray();
            char temp = tempChar[1];
            tempChar[1] = tempChar[3];
            tempChar[3] = temp;

            // char 배열 문자열로 바꾸기
            String result = new String(tempChar);
            map[y] = result;
        }
    }

    static void search(String[] map){
        String tar = "MAPOM";
        for(int i = 0; i < 5; i++){
            if(map[i].equals(tar)){
                System.out. println("yes");
                return;
            }
        }
        System.out. println("no");
    }

    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        String[] map = new String[5];

        for(int i = 0; i < 5; i++){
            map[i] = sc.next();
        }

        swap(map);
        search(map);
    }// ./main()
}
