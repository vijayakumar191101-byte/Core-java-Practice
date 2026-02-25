package Practice;

public class Find_factorial_using_recursion {
    static int fact(int n){
        if (n==0) return 1;
        return n*fact(n - 1);
    }

    static void main(String[] args) {
        System.out.println(fact(4));
    }
}
