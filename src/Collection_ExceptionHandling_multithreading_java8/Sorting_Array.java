package Collection_ExceptionHandling_multithreading_java8;

public class Sorting_Array {
    static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 3};

        for (int i = 0; i<arr.length;i++){
            for (int j = i+1; j<arr.length;j++){
                if (arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
       for (int n:arr){
           System.out.print(n+" ");
       }
    }
}
