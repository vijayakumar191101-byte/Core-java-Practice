package Collection_ExceptionHandling_multithreading_java8;

import java.util.LinkedHashMap;
import java.util.Map;

public class Find_First_Non_Repeated_Character {
    static void main(String[] args) {
        String s = "swiss";
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for (Map.Entry<Character,Integer> e : map.entrySet()){
            if (e.getValue()==1){
                System.out.println(e.getKey());
                break;
            }
        }
    }
}
