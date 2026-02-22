package Practice;

public class Secound_Largest_Number {
    static void main(String[] args) {
        int[] arr = {10, 45,55, 23, 99, 34};

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int i= 0; i<arr.length; i++){
            if (arr[i]>first){
                second = first;
                first = arr[i];
            }
            else if (arr[i]>second && arr[i] != first){
                second = arr[i];
            }
        }
        System.out.println(first);
        System.out.println(second);

        System.out.println("===================================");

        int[] a = {3142,4567,67876,789876,89876};
        int max = Integer.MIN_VALUE;
        int secmax = Integer.MIN_VALUE;

        for (int i =0; i<a.length;i++){
            if (a[i]>max){
                secmax = max;
                max = a[i];
            }else if (a[i]>secmax && a[i]!=max){
                secmax = a[i];
            }
        }
        System.out.println(max);
        System.out.println(secmax);
        System.out.println("========================================");

        int[] b = {56,68,79,58,47,99,137};
        int MAX =Integer.MIN_VALUE;
        int SECMAX = Integer.MIN_VALUE;

        for (int i =0; i<b.length;i++){
            if (b[i]>MAX){
                SECMAX = MAX;
                MAX = b[i];
            }else if (b[i]>SECMAX && b[i] != MAX){
                SECMAX = b[i];
            }
        }
        System.out.println(MAX);
        System.out.println(SECMAX);
    }
}
