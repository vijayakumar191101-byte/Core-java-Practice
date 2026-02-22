package Practice;

import java.util.Scanner;

public class Prime_number {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a value : ");
        int n=scan.nextInt();

        if (n<=1){
            System.out.println("not a prime");
            return;
        }

        boolean prime = true;

        for (int i = 2; i<=n/2;i++){
            if (n%i==0){
                prime = false;
                break;
            }
        }
        System.out.println(prime);
    }
}
