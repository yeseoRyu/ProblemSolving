import java.util.Scanner;

public class URL유효성 {
    static int isValid(String temp) {
        if (!temp.contains("http://") && !temp.contains("https://"))
            return 0;

        int a = temp.indexOf("//");
        int b = temp.indexOf(".");
        if (b == -1)
            return 0;

        String domain = temp.substring(a + 2, b);
        if (domain.length() < 3)
            return 0;

        String endpoint = temp.substring(b);
        if (!endpoint.contains(".com") && !endpoint.contains(".co.kr") && !endpoint.contains(".org")
                && !endpoint.contains(".net"))
            return 0;

        return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* URL 판별하기 */
        String input = "https://https://https://ABC.co.kr.comhttps://BBQ.com.com.com.org";
        int cnt = 0;

        String lowString = input.toLowerCase();
        lowString += "http";
        int a = 0;
        int b = 0;
        while (true) {
            b = lowString.indexOf("http", a);
            if (b == -1)
                break;

            if (a > 0) {
                String temp = lowString.substring(a - 1, b);
                cnt += isValid(temp);
            } else {
                String temp = lowString.substring(a, b);
                cnt += isValid(temp);
            }
            
            a = b + 1;
        }

        System.out.println(cnt + "개");
        sc.close();
    }
}
