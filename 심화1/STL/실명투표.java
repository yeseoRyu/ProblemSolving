import java.util.ArrayList;
import java.util.Scanner;

class Node{
    int v;
    String name;
    
    public Node(int v, String name){
        this.v = v;
        this.name = name;
    }
}

public class 실명투표{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        ArrayList<Node> arr = new ArrayList<>();
        int t = 5;
        int n = 12;
        int[] vote = new int[t];

        for(int i = 0; i < n; i++){
            int v = sc.nextInt();
            String name = sc.next();
            arr.add(new Node(v, name));
            vote[v]++;
        }

        int max = 0;
        for(int i = 0; i < t; i++){
            if(max < vote[i]) max = i;
        }

        for(int i = 0; i < n; i++){
            Node node = arr.get(i);
            if(node.v == max){
                System.out.print(node.name + " ");
            }
        }
    }   
}