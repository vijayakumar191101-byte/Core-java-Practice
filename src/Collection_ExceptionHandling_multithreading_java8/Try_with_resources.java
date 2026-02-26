package Collection_ExceptionHandling_multithreading_java8;

import java.util.Scanner;

public class Try_with_resources {
    static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println(sc.nextInt());
        }catch (Exception e){
            System.out.println("Error occurs");
        }
    }
}
