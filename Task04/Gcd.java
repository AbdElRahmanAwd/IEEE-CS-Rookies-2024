import java.util.Scanner;

public class Gcd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();

        System.out.print(gcd(a, b) + " ");
        System.out.print(lcd(a, b));
        in.close();
    }

    public static long gcd(long num1, long num2) {
        while (num2 != 0) {
            long temp = num1;
            num1 = num2;
            num2 = temp % num1;

        }
        return num1;
    }

    public static long lcd(long num1, long num2) {
        return (num1 / gcd(num1, num2)) * num2;
    }
}