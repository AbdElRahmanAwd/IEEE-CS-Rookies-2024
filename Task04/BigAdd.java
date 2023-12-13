import java.math.BigInteger;
import java.util.Scanner;

public class BigAdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String num1 = in.next();
        // num is very big so we use BigInteger
        BigInteger n = new BigInteger(num1);
        BigInteger n2 = new BigInteger("9999");
        System.out.println(n.add(n2));
        System.out.println(n.multiply(n2));

        in.close();

    }
}
