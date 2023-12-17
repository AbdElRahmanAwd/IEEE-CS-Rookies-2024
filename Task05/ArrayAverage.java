import java.util.Scanner;

public class ArrayAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] array = newArray(size, input);
        double average = calcAverage(array, size, 0, 0);
        System.out.printf("%.6f", average);
    }

    public static int[] newArray(int size, Scanner input) {
        int[] newArray = new int[size];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = input.nextInt();
        }
        return newArray;
    }

    public static double calcAverage(int[] arr, int n, int index, double sum) {
        if (index == n)
            return sum / n;

        return calcAverage(arr, n, index + 1, sum + arr[index]);
    }
}