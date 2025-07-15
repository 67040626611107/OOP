import java.util.Scanner;

class Palindrome {
    private String word;
    public Palindrome(String str) {
        this.word = str;
    }
    int isPalindrome() {
        StringBuilder sb = new StringBuilder(word);
        int ret = word.equals(sb.reverse().toString()) ? 1 : 0;
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
