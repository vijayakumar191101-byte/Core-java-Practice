package Collection_ExceptionHandling_multithreading_java8;

import java.util.Arrays;

public class Check_Anagram {
    static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";
        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        System.out.println(Arrays.equals(a,b));
    }
}
