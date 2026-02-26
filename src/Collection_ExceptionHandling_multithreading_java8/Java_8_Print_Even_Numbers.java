package Collection_ExceptionHandling_multithreading_java8;

import java.util.Arrays;
import java.util.List;

public class Java_8_Print_Even_Numbers {
    static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
        list.stream()
                .filter(n -> n%2==0)
                .forEach(System.out::println);
    }
}
