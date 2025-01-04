import java.util.*;
class Node{
    int n;
    int price;

    public Node(int n , int price){
        this.n = n;
        this.price = price;
    }
}

public class DFS탐색2 {
    static ArrayList<ArrayList<Node>> arr = new ArrayList<>();
    static int[] used = new int[10];

    static void run(int now, int sum){
        if(now == 2){
            System.out.println(sum);
        }

        for(int i = 0; i < 2; i++){
            Node next = arr.get(now).get(i);
            if(next.n == 0) continue;
            if(used[next.n] == 1) continue;

            used[next.n] = 1;
            run(next.n, sum + next.price);
            used[next.n] = 0;
        }

    }


    public static void main(String[] args){
        ArrayList t1 = new ArrayList<>();
        t1.add(new Node(1,5));
        t1.add(new Node(2,8));
        arr.add(t1);

        ArrayList t2 = new ArrayList<>();
        t2.add(new Node(2,6));
        t2.add(new Node(0,0));
        arr.add(t2);

        ArrayList t3 = new ArrayList<>();
        t3.add(new Node(1,7));
        t3.add(new Node(2,9));
        arr.add(t3);

        run(0, 0);

    }//main./

}