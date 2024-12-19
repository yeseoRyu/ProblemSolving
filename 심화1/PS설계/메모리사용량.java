import java.util.*;
public class 메모리사용량{
    /* 메모리 사용량 계산하기 */

    void number1(){
        int[] data = new int[10];
    }
    /* int --> 4 byte
     * 40 byte
     */

    void number2(){
        double[] data = new double[3];
        char[] vect = new char[10];
        int[] dt = new int[10];
    }
    /* double --> 8 byte
     * char --> 1 byte
     * 24 + 10 + 40 = 74 byte
     */

    class Node{
        int x;
        char t;
    }
    void number3(){
        Node[] vect = new Node[100];
    }
    /* Node --> 4 * 2 byte  (char를 위한 공간이 int 메모리 공간만큼 늘기 때문문)
     * 800 byte
     */
    

    void number4(){
        // char t --> char* next 라고 가정
        Node vect;
    }
    /* pointer char* --> 4 byte
     * Node --> 4 * 4 byte
     * 16 byte
     */

    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int retult = 0;

        switch (n) {
            case 1: retult = 40; break;
            case 2: retult = 74; break;
            case 3: retult = 800; break;
            case 4: retult = 16; break;
        }

        System.out.println(retult);
    }// ./main()
}