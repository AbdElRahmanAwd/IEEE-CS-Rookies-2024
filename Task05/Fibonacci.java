import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        System.out.println(function(N));
    }

    public static int function(int N){
        if (N == 1)
            return 0;
        else if (N == 2)
            return 1;
        return function(N-1)+function(N-2);
    }
}