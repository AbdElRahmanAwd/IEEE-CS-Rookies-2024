import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String S = input.nextLine();

        int wordCount = countWords(S);
        System.out.println(wordCount);
    }

    public static int countWords(String S) {
        String[] words = S.split("[\\s!.,?]+");

        int count = 0;
        for (String word : words) {
            if (!word.isEmpty()) {
                count++;
            }
        }
        return count;
    }
}
