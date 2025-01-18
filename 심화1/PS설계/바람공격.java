import java.util.Scanner;

public class 바람공격{
    static int[][] map = new int[3][3];
    static int[] cloud;

    static int getLast(int t){
        String temp = Integer.toString(t);
        char last = temp.charAt(temp.length()-1);
        return Integer.parseInt(Character.toString(last));
    }

    static void windy(int i){
        for(int y = 0; y < 3; y++){
            for(int x = 0; x < 3; x++){
                if(map[y][x] > 0){
                    int n = getLast(map[y][x]);
                    if(cloud[i] >= n){
                        String temp = Integer.toString(map[y][x]);
                        String result = temp.substring(0, temp.length()-1);
                        if (result.isEmpty()) map[y][x] = 0;
                        else map[y][x] = Integer.parseInt(result);
                    }else{
                        map[y][x] = map[y][x] - cloud[i];
                    }
                }
            }
        }
    }

    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();

        for(int i = 0; i < n1; i++){
            int y = sc.nextInt();
            int x = sc.nextInt();
            int r = sc.nextInt();
            map[y][x] = r;
        }
        int n2 = sc.nextInt();
        cloud = new int[n2];
        for(int i = 0; i < n2; i++){
            int c = sc.nextInt();
            cloud[i] = c;
        }

        for(int i = 0; i < n2; i++){
            windy(i);
        }

        int cnt = 0;
        for(int y = 0; y < 3; y++){
            for(int x = 0; x < 3; x++){
                if(map[y][x] > 0){
                    int d = 1;
                    String temp = Integer.toString(map[y][x]);
                    cnt += temp.length();
                }
            }
        }

        System.out.println(cnt);
    }   
}