import java.util.Scanner;

public class Xor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long A = in.nextLong();
        long B = in.nextLong();
        long Q = in.nextLong();
        long res = Q % 3;
        if (res == 1) {
            System.out.println(A);
        } else if (res == 2) {
            System.out.println(B);
        } else  {
            System.out.println((A ^ B));
        }

        in.close();
    }

}