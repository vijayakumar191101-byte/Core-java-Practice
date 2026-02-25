package Collection_ExceptionHandling_multithreading_java8;

public class Find_duplicate_in_Array {
    static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 5, 1};

        for (int i = 0; i<arr.length;i++){
            for (int j = i+1; j<arr.length;j++){
                if (arr[i]==arr[j]){
                    System.out.println(arr[i]);
                }
            }
        }
    }
}
