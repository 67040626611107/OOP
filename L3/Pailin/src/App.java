import java.util.Scanner;

class Palindrome {
    private String word;
    public Palindrome(String str) {
        
        this.word = str;
    }
    int isPalindrome() {
        int i = 0; 
        String temp = "";
        while (i < word.length()) {
            char ch = word.charAt(i);
            if (Character.isLetter(ch)) {
                temp += Character.toLowerCase(ch);
            }
            i++;
        }
        StringBuilder sb = new StringBuilder(temp);
        int ret =  temp == sb.reverse().toString() ? 0 : 1;
        return ret;
    }
}

public class App {
    public static void main(String[] args) throws Exception {
       Scanner input = new Scanner(System.in);
       String st = input.nextLine();
       Palindrome Palindrome = new Palindrome(st);
       System.out.println(Palindrome.isPalindrome());
    }
}
