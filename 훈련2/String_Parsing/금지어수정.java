import java.util.Scanner;

public class 금지어수정 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] valid = { "KFC", "MC", "BICMAC", "SHACK", "SONY" };
        String[] after = { "#BBQ#", "#BBQ#", "#MACBOOK#", "#SHOCK#", "#NONY#" };

        String input = sc.next();

        for (int i = 0; i < 5; i++) {
            input = input.replaceAll(valid[i], after[i]);
        }

        System.out.println(input);
        sc.close();
    }
}
