package 배열;
import java.util.ArrayList;

public class mmxx중복없이 {
    static ArrayList<Integer> list = new ArrayList<>();

    // 체크를 하고 지워버리기
    static void getMin() {
        int min = 9;
        int minIndex = 0;

        for (int i = 0; i < list.size(); i++) {
            if (min > list.get(i)) {
                min = list.get(i);
                minIndex = i;
            }
        }

        System.out.print(min);
        list.remove(minIndex);
    }

    static void getMax() {
        int max = 0;
        int maxIndex = 0;

        for (int i = 0; i < list.size(); i++) {
            if (max < list.get(i)) {
                max = list.get(i);
                maxIndex = i;
            }
        }

        System.out.print(max);
        list.remove(maxIndex);
    }

    public static void main(String[] args) {
        int[] num = { 3, 7, 4, 0, 9, 6 };
        String input = "mxmmxx";

        for (int value : num) {
            list.add(value);
        }

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'm') {
                getMin();
            } else if (input.charAt(i) == 'x') {
                getMax();
            }
        }
    }
}
