package Programmers.kit.stack;

import java.util.ArrayList;

public class 같은_숫자는_싫어1 {
    public int[] solution(int []arr) {

        ArrayList<Integer> list = new ArrayList<>();
        int value = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=value){
                list.add(arr[i]);
                value = arr[i];
            }
        }


        return list.stream().mapToInt(i->i).toArray();
    }

    public static void main(String[] args) {

        같은_숫자는_싫어1 p = new 같은_숫자는_싫어1();

        int [] arr = {1,1,3,3,0,1,1};
        p.solution(arr);




    }
}
