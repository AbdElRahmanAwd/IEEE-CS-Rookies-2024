import java.util.Scanner;

public class ReachValue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        for (int i = 0; i < t; i++) {
            long n = in.nextLong();
            if (isReach(1, n)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    private static boolean isReach(long value, long target) {
        if (value == target) {
            return true;
        }
        if (value > target) {
            return false;
        }
        return isReach(value * 10, target) || isReach(value * 20, target);
    }
}