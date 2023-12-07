import java.util.Scanner;

public class Print {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        print(n);

    }

    public static void print(int n) {

        for (int i = 1; i < n; i++)
            System.out.print(i + " ");

        System.out.print(n);
    }
}