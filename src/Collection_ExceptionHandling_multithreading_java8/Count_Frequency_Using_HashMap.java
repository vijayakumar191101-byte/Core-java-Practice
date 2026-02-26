package Collection_ExceptionHandling_multithreading_java8;

import java.util.HashMap;
import java.util.Map;

public class Count_Frequency_Using_HashMap {
    static void main(String[] args) {
        String s = "apple";
        Map<Character,Integer> map = new HashMap<>();

        for (char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        System.out.println(map);
    }
}
