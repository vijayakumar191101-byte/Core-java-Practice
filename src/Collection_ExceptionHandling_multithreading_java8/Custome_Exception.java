package Collection_ExceptionHandling_multithreading_java8;

import java.util.Scanner;

class AgeExcetion extends Exception{
    AgeExcetion(String msg){
        super(msg);
    }
}



public class Custome_Exception {
    static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.print("Enter your Age : ");
        int Age = scn.nextInt();

        try{
            if (Age<18){
                throw new AgeExcetion("Age must be 18 or above");
            }
            System.out.println("Eligible for voute");
        }catch (AgeExcetion e){
            System.out.println("Error:" + e.getMessage());
        }
    }
}
