package Practice;

public class Find_Largest_Number {
    static void main(String[] args) {
        int[] arr = {10, 45, 23, 99, 100, 34};
        int max = arr[0];

        for (int i = 0; i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);
        System.out.println("=========================================");

        int[] a = {134,468,98,532,347,764,854,243};
        int MAX = a[0];

        for (int i=0; i<a.length;i++){
            if (a[i]>MAX){
                MAX = a[i];
            }
        }
        System.out.println(MAX);
    }
}
