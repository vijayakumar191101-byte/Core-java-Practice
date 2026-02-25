package Practice;

public class Find_smallest_element_in_Array {
    static void main(String[] args) {
        int [] a={5,6,7,3,7,2,3,8,9};
        int min = a[0];

        for (int i = 0;i<a.length;i++){
            if (a[i]<min){
                min = a[i];
            }
        }
        System.out.println(min);
    }
}
