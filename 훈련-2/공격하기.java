import java.util.*;

public class 공격하기 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> hero = new ArrayList<>();
        int n = sc.nextInt();
        int cnt = 0;
        hero.add("B");
        hero.add("I");
        hero.add("A");
        hero.add("H");

        while(true){
            if(hero.size() == 0) break;
            for(int i = 0; i < hero.size(); i++){
                cnt++;
                if(cnt == n){
                    System.out.print(hero.get(i) + " ");
                    hero.remove(i);
                    cnt = 0;
                    i = i-1;
                }
            }
        }

        sc.close();
    }//main./
}
