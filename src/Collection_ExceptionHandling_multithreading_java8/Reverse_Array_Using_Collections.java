package Collection_ExceptionHandling_multithreading_java8;

import java.util.*;

public class Reverse_Array_Using_Collections {
    static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        Collections.reverse(list);
        System.out.println(list);
    }
}
