public class 단어파싱 {
    public static void main(String[] args) {
        String input = "HOT_FRIED____CHICKEN_KFC_IS_BEST";
        String[] parsing = input.split("_");

        int cnt = 1;
        for (int i = 0; i < parsing.length; i++) {
            if (parsing[i].length() > 1) {
                System.out.print(cnt + "#" + parsing[i]);
                cnt++;
                System.out.println();
            }
        }
    }
}
