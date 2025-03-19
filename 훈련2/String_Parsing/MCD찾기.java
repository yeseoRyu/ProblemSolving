package String_Parsing;

import java.util.Scanner;

public class MCD찾기 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] input = new String[5];
        for(int i = 0; i < 5; i++){
            input[i] = sc.next();
        }


        /* MCD가 몇개 있는지 출력 */
        int re = 0;

        for (int i = 0; i < 5; i++) {
            // indexOf 의 from을 a+1로 함으로써 0번째부터 찾음
            int a = -1;

            while (true) {
                // 0 번째부터 다음으로 쭉쭉 넘어감 (a에 재대입)
                a = input[i].indexOf("MCD", a + 1);

                // 해당 단어가 없으면 -1 반환환
                if (a == -1)
                    break;
                re++;
            }
        }

        System.out.println(re);
        sc.close();
    }//main./
}