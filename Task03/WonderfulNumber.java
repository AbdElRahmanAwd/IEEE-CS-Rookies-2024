import java.util.Scanner;

public class WonderfulNumber {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int n = input.nextInt();

        if (wonderfulNumber(n))
            System.out.println("YES");
        else
            System.out.println("NO");
    }

    public static boolean wonderfulNumber(int n) {
        return (n % 2 != 0) && isPinary(pinary(n));
    }

    public static String pinary(int n) {
        String S = "";
        while (n != 0){
            S += n%2;
            n /= 2;
        }
        return S;
    }

    public static boolean isPinary(String S) {
        boolean check = true;

        for (int i = 0; i < S.length()/2 ; i++) {
            if (S.charAt(i) != S.charAt(S.length()-i-1))
                check = false;

        }
        return check;
    }
}