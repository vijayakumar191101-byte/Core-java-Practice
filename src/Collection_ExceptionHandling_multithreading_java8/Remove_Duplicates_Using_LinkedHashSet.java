package Collection_ExceptionHandling_multithreading_java8;

import java.util.LinkedHashSet;
import java.util.Set;

public class Remove_Duplicates_Using_LinkedHashSet {
    static void main(String[] args) {
        int[] arr = {1,2,2,3,4,5,4};
        Set<Integer> set = new LinkedHashSet<>();

        for (int n : arr){
            set.add(n);
        }
        System.out.println("Original Array by removed duplicates using LinkedHashList : "+set);
    }
}
