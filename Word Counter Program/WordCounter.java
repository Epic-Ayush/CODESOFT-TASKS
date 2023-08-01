import java.util.Scanner;
import java.util.regex.Pattern;

public class WordCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text;
        System.out.println("Enter the text :");
        text = sc.nextLine();
        String[] arr = splitStringIntoWords(text);
        int count = 0;
        for (String word : arr) {
            count++;
            System.out.println(word);
        }

        System.out.println("The total count of words  = " + count);
        sc.close();

    }

    public static String[] splitStringIntoWords(String input) {
        return input.split("\\s+|\\p{Punct}");
    }
}