import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Node{
    String name;
    int score;
    
    public Node(String name, int score){
        this.name = name;
        this.score = score;
    }
}

public class 점수삽입정렬 {
    static int sort(Node a, Node b){
        if(a.score < b.score) return 1;
        else if(a.score == b.score) return 1;
        return 0;
    }


    static void printResult(ArrayList<Node> result){
        for(int i = 0; i < result.size(); i++){
            System.out.print(result.get(i).name + " ");
            if(i == 2) break;
        }
        System.out.println();
    }

    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        ArrayList<Node> array = new ArrayList<>();
        ArrayList<Node> result = new ArrayList<>();
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            String t = sc.next();
            int s = sc.nextInt();
            array.add(new Node(t, s));
        }

        for(int i = 0; i < n; i++){
            result.add(array.get(i));

            for(int x = 0; x < i; x++){
                if(sort(result.get(x), result.get(i)) == 1){
                    Collections.swap(result, x, i);
                }
            }
            printResult(result);
        }
    }
}
