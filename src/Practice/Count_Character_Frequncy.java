package Practice;

public class Count_Character_Frequncy {
    static void main(String[] args) {
        String s = "banana";
        int[] freq = new int[26];         //a-z
        for (int i=0; i <s.length();i++){
            char ch = s.charAt(i);
            freq[ch - 'a']++;
        }
        for (int i=0; i<26;i++){
            if (freq[i]>0){
                System.out.println((char)(i+'a') +" = "+freq[i]);
            }
        }

        System.out.println("=====================================");


        String l = "vijayakumar";
        int count = 0;
        for (int i=0; i<l.length();i++){
            if (l.charAt(i)=='a'){
                count++;
            }
        }
        System.out.println(count);
    }
}
