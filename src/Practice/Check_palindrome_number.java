package Practice;

public class Check_palindrome_number {
    static void main(String[] args) {
        int n = 121, temp = n, rev = 0;
        while(temp >0){
            int rem = temp % 10;
            rev =rev * 10 + rem;
            temp /=10;
        }
        System.out.println(n == rev ? "isPalindrome" : "Not a Palimdron");
    }
}
