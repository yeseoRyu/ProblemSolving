public class 이메일정리 {
    
    static void validCheck(String temp) {
        if (!temp.contains("@"))
            return;
        if (!temp.contains("."))
            return;

        int c = temp.indexOf("@");
        int d = temp.indexOf(".", c);
        String name = temp.substring(0, c);
        String domain = temp.substring(c + 1, d);

        System.out.print("[#" + name + "] " + domain);
        System.out.println();
    }

    public static void main(String[] args) {
        String input = "bbq@mcdonald.co.kr|jyp@sam.com|imac@donald.com";
        input += "|";

        int a = 0;
        int b = 0;
        while (true) {
            b = input.indexOf("|", a);

            if (b == -1) {
                break;
            }

            String temp = input.substring(a, b);
            validCheck(temp);

            a = b + 1;
        }
    }

}
