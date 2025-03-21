public class 가장작은영역 {
    /*
     * 연속되어 있는 4칸의 합을 구할 때,
     * 가장 작은 값이 몇인지 출력
     */

    public static void main(String[] args) {
        int[] input = { 7, 2, 4, 3, 2, 1, 1, 9, 2 };
        int limit = input.length - 4;
        int min = 99;
        int sum = 0;

        for (int i = 0; i < 4; i++) {
            sum += input[i];
        }

        for (int i = 0; i < limit; i++) {
            if (min > sum) {
                min = sum;
            }
            sum -= input[i];
            sum += input[i + 4];
        }

        System.out.println(min);
    }

}