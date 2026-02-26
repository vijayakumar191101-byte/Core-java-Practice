package Collection_ExceptionHandling_multithreading_java8;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Sort_HashMap_by_Key {
    static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(3,"C");
        map.put(1,"A");
        map.put(2,"B");
        map.put(4,"D");
        Map<Integer,String> sorted = new TreeMap<>(map);
        System.out.println(sorted);
    }
}
