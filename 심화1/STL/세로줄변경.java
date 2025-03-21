public class 세로줄변경 {
    /* 1행과 3행 swap 후 MAPOM이라는 단어 찾기 */

    static String swap(String str) {
        char[] arr = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }

        char temp = arr[1];
        arr[1] = arr[3];
        arr[3] = temp;

        return new String(arr);     // String 매개변수 안에 char 배열 그대로 넣기
    }

    public static void main(String[] args) {
        String[] input = {
                "ABCDE",
                "QWERT",
                "ZXCVB",
                "OPERA",
                "MOPAM"
        };
        int flag = 0;

        for (int i = 0; i < input.length; i++) {
            input[i] = swap(input[i]);
            if (input[i].equals("MAPOM")) {
                flag = 1;
                break;
            }
        }

        if (flag == 1)
            System.out.println("yes");
        else
            System.out.println("no");
    }

}
