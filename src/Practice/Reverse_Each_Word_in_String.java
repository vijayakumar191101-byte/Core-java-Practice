package Practice;

public class Reverse_Each_Word_in_String {
    static void main(String[] args) {
        String s = "MY NAME IS VIJAYAKUMAR , COME FROM KALLAKURICHY";
        String[] words = s.split(" ");

        System.out.println(words);

        for (String word: words){
            String rev = "";
            for (int i = word.length()-1;i>=0;i--){
                rev = rev + word.charAt(i);
            }
            System.out.print(rev +" ");
        }

    }
}
