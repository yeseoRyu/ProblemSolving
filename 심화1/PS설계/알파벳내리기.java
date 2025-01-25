import java.util.Scanner;

public class 알파벳내리기 {
    /*
     * 입력받은 알파벳 1씩 감소시키면서 출력
     * A보다 작아지면 사라짐
     * ACEDAF
     * _BDC_E
     * _ACB_D
     * __BA_C
     * __A__B
     * _____A
     * ______
     */
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        System.out.println(input);

        while (true) {
            String str = new String();

            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) <= 'A' || input.charAt(i) >= 'Z') {
                    str += "_";

                } else {
                    char m = (char) (input.charAt(i) - 1);
                    str += Character.toString(m);
                }
            }

            System.out.println(str);

            // 검사
            int flag = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) != '_') {
                    flag = 0;
                    break;
                } else {
                    flag = 1;
                }
            }
            if (flag == 1)
                break;
            input = str;
        }

        sc.close();
    }
}