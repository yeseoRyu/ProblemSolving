import java.util.ArrayList;
import java.util.Collections;

public class 이름정렬{
    static int swap(String a, String b){
        if(a.length() > b.length()) return 1;
        return 0;
    }

    static ArrayList<String> slide(ArrayList<String> name, int i, int x){
        String temp = name.get(x);
        for(int y = x; y > i; y--){
            String n = name.get(y-1);
            name.remove(y);
            name.add(y, n);
        }
        name.remove(i);
        name.add(i, temp);
        return name;
    }

    public static void main(String[] arg){
        ArrayList<String> name = new ArrayList<>();
        name.add("aaleh");
        name.add("amily");
        name.add("acome");
        name.add("john");
        name.add("java");
        int n = 5;
        Collections.sort(name);

        for(int i = 0; i < n; i++){
            for(int x = i+1; x < n; x++){
                if(swap(name.get(i), name.get(x)) == 1){
                    name = slide(name, i, x);
                }
            }
        }

        for(int i = 0; i < n; i++){
            System.out.println(name.get(i));
        }
    }   
}