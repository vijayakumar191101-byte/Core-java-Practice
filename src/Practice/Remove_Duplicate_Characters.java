package Practice;

public class Remove_Duplicate_Characters {
    static void main(String[] args) {
        String s = "programming";
        String result = "";
        for (char ch : s.toCharArray()){
            if (result.indexOf(ch)==-1){
                result+=ch;
            }
        }
        System.out.println(result);
    }
}
