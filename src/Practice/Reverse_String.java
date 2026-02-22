package Practice;

public class Reverse_String {
    static void main(String[] args) {
        String s = "ramukayajiv";
        String rev = "";

        for(int i=s.length()-1; i >= 0; i--){
            rev +=s.charAt(i);
        }
        System.out.println(rev);

        System.out.println("====================================");

        String a = "kamalesh";

        String res = "";

        for(int i=a.length()-1; i>=0;i--){
            res +=a.charAt(i);
        }
        System.out.println(res);




    }
}



