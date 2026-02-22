package Practice;

public class Swap_tow_number_without_temp {
    static void main(String[] args) {
        int a = 5; int b = 10;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a+" "+b);
    }
}
