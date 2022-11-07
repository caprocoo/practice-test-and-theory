package Programmers;


public class Ground {

    public int solution(int n) {
        int [] arr = new int[n+1];
        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i <= n; i++) {
//            arr[i] = arr[i-1] + arr[i-2];
            int sum = arr[i-1] + arr[i-2];
            arr[i] = sum%1234567;
        }


        return arr[n];
    }


    public static void main(String[] args) {
        Ground g = new Ground();
        int n = 3;
        g.solution(n);
    }
}
