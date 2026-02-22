package Practice;

public class palindrome {
    static void main(String[] args) {
        String s = "amma";
        String rev ="";
        for(int i = s.length()-1; i>=0;i--){
            rev +=s.charAt(i);
        }
        if(s.equals(rev)){
            System.out.println("is Palindrome");
        }else{
            System.out.println("is Not Palindrome");
        }
    }
}
