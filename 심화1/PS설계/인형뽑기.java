import java.util.ArrayList;
import java.util.Arrays;
/*
 * 주어진 board를 세로를 기준으로 stack처럼 쌓일 때,
 * moves에 따라 줄에 하나씩 꺼내어 result stack에 쌓는다.
 * 이때, 같은 수가 겹쳐서 result에 쌓이면 두 수는 폭파되어 없어진다.
 * 총 폭파된 수의 개수를 구하여라.
*/
public class 인형뽑기{
    static ArrayList<Integer> result = new ArrayList<>();
    static int popCnt;
    
    // 3. result 넣기
    static void push(int t){
        if(result.size() == 0){
            result.add(t);
            return;
        }
        
        int last = result.size() - 1;
        int old = result.get(last);
        if(old == t){
            result.remove(last);
            popCnt += 2;
            return;
        }
        result.add(t);
    }
    

    static void solution(ArrayList<ArrayList<Integer>> board, ArrayList<Integer> moves){
        ArrayList<ArrayList<Integer>> map = new ArrayList<>();
        int n = board.size();

        // 1. 맵 만들기
        for(int x = 0; x < n; x++){
            map.add(new ArrayList<>());

            for(int y = n-1; y >= 0; y--){
                int t = board.get(y).get(x);
                if(t == 0) continue;
                map.get(x).add(t);
            }
        }

        for(int i = 0;  i < moves.size(); i++){
            int row = moves.get(i) - 1;
            if(map.get(row).size() == 0) continue;  // 비어있는 줄이면 건너뛰기
            int last = map.get(row).size() - 1;

            // 2. 제일 위에 쌓인 수 꺼내기
            int ret = map.get(row).get(last);
            map.get(row).remove(last);
            push(ret);
        }
    }

    public static void main(String[] arg){
        ArrayList<ArrayList<Integer>> board = new ArrayList();
        board.add(new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 0)));
        board.add(new ArrayList<Integer>(Arrays.asList(0, 0, 1, 0, 3)));
        board.add(new ArrayList<Integer>(Arrays.asList(0, 2, 5, 0, 1)));
        board.add(new ArrayList<Integer>(Arrays.asList(4, 2, 4, 4, 2)));
        board.add(new ArrayList<Integer>(Arrays.asList(3, 5, 1, 3, 1)));
        ArrayList<Integer> moves = new ArrayList<>(Arrays.asList(1, 5, 3, 5, 1, 2, 1, 4));

        solution(board, moves);

        System.out.println(popCnt);
    }

}