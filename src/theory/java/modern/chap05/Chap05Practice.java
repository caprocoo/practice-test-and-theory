package theory.java.modern.chap05;

import theory.java.modern.example.Dish;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * packageName    : theory.java.modern.chap05
 * fileName       : Chap05Practice
 * author         : caprocoo
 * date           : 2023-01-13
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-01-13        caprocoo       최초 생성
 */
public class Chap05Practice {
    public static void main(String[] args) {
//        List<Integer> arr = Arrays.asList(1, 2, 3, 4, 5, 4, 4, 1);
//        arr.stream().filter(i -> i % 2 == 0).distinct().forEach(System.out::println);

        // p. 165 예제1
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> dd = integerList.stream().map(n -> n*n).collect(Collectors.toList());
        System.out.println(dd);

        // p.166 예제2
        List<Integer> a = Arrays.asList(1, 2, 3);
        List<Integer> b = Arrays.asList(3, 4);

        List<int[]> list = a.stream().flatMap(i-> b.stream().map(j->new int[]{i,j})).collect(Collectors.toList());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(Arrays.toString(list.get(i)));
        }

        // p.166 예제3
        List<int[]> list2 = a.stream().flatMap(i-> b.stream().filter(j-> (i+j)%3==0).map(j->new int[]{i,j})).collect(Collectors.toList());
        for (int i = 0; i < list2.size(); i++) {
            System.out.println(Arrays.toString(list2.get(i)));
        }







    }

}
