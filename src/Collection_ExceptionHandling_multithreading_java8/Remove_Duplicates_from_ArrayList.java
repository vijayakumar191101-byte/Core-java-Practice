package Collection_ExceptionHandling_multithreading_java8;

import java.util.*;

public class Remove_Duplicates_from_ArrayList {
    static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,2,3,4,4));
        Set<Integer> set = new HashSet<>(list);
        System.out.println(set);

    }
}
