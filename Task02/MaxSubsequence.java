import java.util.Scanner;

public class MaxSubsequence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        String S = input.next();

        int maxSize = maxSubsequenceSize(S);
        System.out.println(maxSize);
    }

    public static int maxSubsequenceSize(String S) {
        int count = 1;
        for (int i = 1; i < S.length(); i++) {
            if (S.charAt(i) != S.charAt(i - 1)) {
                count++;
            }
        }
        return count;
    }
}
