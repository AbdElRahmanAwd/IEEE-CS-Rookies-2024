import java.util.Scanner;

public class PrimeFunction {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         int n = input.nextInt();
         int number ;
        for (int i = 0; i < n; i++) {
            number = input.nextInt();
            if (primeFunction(number))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }

    public static boolean primeFunction(int n) {
        if (n <= 1)
            return false;

        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n%i == 0)
                return false;

        return true;
    }
}