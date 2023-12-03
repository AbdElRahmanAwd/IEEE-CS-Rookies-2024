import java.util.Scanner;

public class Subsequence_String {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.next();

        if (hasHelloSubsequence(text)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static boolean hasHelloSubsequence(String S) {
        String target = "hello";
        int i = 0, j = 0;

        while (i < S.length() && j < target.length()) {
            if (S.charAt(i) == target.charAt(j)) {
                j++;
            }
            i++;
        }

        return j == target.length();
    }
}
