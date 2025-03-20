public class 괄호파싱 {
    public static void main(String[] args) {
        /* 괄호 안에 있는 숫자를 파싱하여 순서대로 계산한 값 구하기
         * [] --> +
         * {} --> *
         */
        String input = "ABC123[10]B{3}AT[20][10]BB{2}Q";

        int a = 0;
        int b = 0;
        int result = 0;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '[') {
                b = input.indexOf("]", i);
                String temp = input.substring(i + 1, b);
                result += Integer.parseInt(temp);

            } else if (input.charAt(i) == '{') {
                a = input.indexOf("}", i);
                String temp = input.substring(i + 1, a);
                result *= Integer.parseInt(temp);
            }
        }

        System.out.println(result);
    }

}
