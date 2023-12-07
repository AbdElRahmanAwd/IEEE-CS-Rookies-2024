import java.util.Scanner;

public class Equation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int X = input.nextInt();

        System.out.println(equation(N,X));
    }

    public static long equation(int n, int z) {
        long result = -1;

        for (int i = 0; i <= z; i++) {
            if (i%2 != 0)
                continue;

            result += Math.pow(n,i);
        }
        return result;
    }
}