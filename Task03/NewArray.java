import java.util.Scanner;

public class NewArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int [] A = new int[n];
        int [] B = new int[n];

        for (int i = 0; i < n; i++)
            A [i] = input.nextInt();

        for (int i = 0; i < n; i++)
            B [i] = input.nextInt();

        newArray(A,B);
    }

    public static void newArray(int [] A, int [] B) {
        for (int b: B)
            System.out.print(b + " ");

        for (int a: A)
            System.out.print(a + " ");

    }

}