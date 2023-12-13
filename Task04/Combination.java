import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long r = in.nextLong();

        long per = fact(n) / fact(n - r);
        long comb = fact(n) / (fact(n - r) * fact(r));
        System.out.print(comb + " " + per);
        in.close();
    }

    static long fact(long x) {
        long count = 1;
        long result = 1;
        while (count <= x) {
            result *= count;
            count++;
        }
        return result;

    }

}
