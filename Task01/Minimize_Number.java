import java.util.Scanner;

public class Minimize_Number {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        byte arrSize = input.nextByte();
        int [] numbers = new int[arrSize];

        for (int i = 0; i < numbers.length; i++) {
            numbers [i] = input.nextInt();
        }

        System.out.println(minimize(numbers));
    }

    public static int minimize(int[] arr) {
        int count = 0;
        boolean allEven = true;

        while (allEven) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 != 0) {
                    allEven = false;
                    break;
                } else {
                    arr[i] /= 2;
                }
            }

            if (allEven) {
                count++;
            }
        }

        return count;
    }

}