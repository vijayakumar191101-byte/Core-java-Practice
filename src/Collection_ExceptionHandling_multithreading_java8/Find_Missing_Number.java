package Collection_ExceptionHandling_multithreading_java8;

public class Find_Missing_Number {
    static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,8};
        int n = 8;
        int sum = n * (n+1) / 2;
        int arrSum=0;

        for (int x :arr){
            arrSum = arrSum + x;
            System.out.println(sum-arrSum);
        }
    }
}
