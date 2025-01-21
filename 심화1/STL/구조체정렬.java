import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Node{
    int n;
    char ch;
    
    public Node(int n, char ch){
        this.n = n;
        this.ch = ch;
    }
}

public class 구조체정렬 {
    static int sort(Node a, Node b){
        if(a.n > b.n) return 1;
        else if(a.n == b.n && a.ch > b.ch) return 1;
        return 0;
    }

    public static void main(String[] arg){
        ArrayList<Node> arr = new ArrayList<>();
        ArrayList<Node> result = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            int t = sc.nextInt();
            char c = sc.next().charAt(0);
            arr.add(new Node(t, c));
        }

        for(int i = 0; i < n; i++){
            result.add(arr.get(i));
            if(i == 0) continue;
            for(int x = i; x> 0; x--){
                if(sort(result.get(x-1), result.get(x)) == 1){
                    Collections.swap(result, x-1, x);
                }
            }
        }

        for(int i = 0; i < n; i++){
            Node node = result.get(i);
            System.out.println(node.n + " " + node.ch);
        }
    }
}
