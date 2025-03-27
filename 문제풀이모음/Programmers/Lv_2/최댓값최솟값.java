package 문제풀이모음.Programmers.Lv_2;

class 최댓값최솟값 {
    public String solution(String s) {
        String answer = "";
        String[] aa = s.split(" ");
        int max = -9999;
        int min = 9999;
        
        for(int i = 0; i < aa.length; i++) {
            int temp = Integer.parseInt(aa[i]);
            if(max < temp) max = temp;
            if(min > temp) min = temp;
        }
        
        answer = min + " " + max;
        return answer;
    }
}