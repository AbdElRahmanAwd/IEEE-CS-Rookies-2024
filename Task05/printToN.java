import java.util.Scanner;

public class printToN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        oneToN(N);
    }

    public static void oneToN(int n) {
        if (n <= 0)
            return;

        oneToN(n - 1);
        System.out.println(n);
    }
}