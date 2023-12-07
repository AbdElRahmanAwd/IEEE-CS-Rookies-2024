import java.util.Scanner;

public class ShiftRight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int times = input.nextInt();
        int [] A = new int[N];

        for (int i = 0; i < A.length; i++)
            A [i] = input.nextInt();

        shiftRight(A,times);
    }

    public static void shiftRight(int [] array, int times) {
        int shift = times% array.length;

        for (int i = array.length-shift ; i < array.length; i++)
            System.out.print(array[i] + " ");

        for (int i = 0; i < array.length-shift; i++)
            System.out.print(array[i] + " ");

    }
}