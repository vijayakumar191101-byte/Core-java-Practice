package Practice;

public class Fibonacci_Series {
    static void main(String[] args) {
        int a= 0; int b = 1;
        for (int i=0;i<9;i++){
            System.out.println(a+" ");
            int c =a+b;
            a=b;
            b=c;
        }
    }
}
