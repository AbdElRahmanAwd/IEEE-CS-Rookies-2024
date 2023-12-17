import java.util.Scanner;

public class Sequence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        System.out.println(sequenceLength(N));
    }

    public static int sequenceLength(int n) {
        if (n == 1) {
            return 1;
        } else if (n % 2 == 0) {
            return 1 + sequenceLength(n / 2);
        } else {
            return 1 + sequenceLength(3 * n + 1);
        }
    }
}