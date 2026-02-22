package Practice;

import java.util.Scanner;

public class Factorial_number {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter N value : ");

        int n = scan.nextInt();
        int fact = 1;
        for (int i=1;i<=n;i++){
            fact *=i;
        }
        System.out.println(fact);
    }
}
