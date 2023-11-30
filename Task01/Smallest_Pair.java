import java.util.Scanner;

public class Smallest_Pair {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number_of_cases = input.nextInt();

        while (number_of_cases > 0) {

            int count = input.nextInt();
            int [] numbers = new int[count];
            for (int i = 0; i < count; i++)
                numbers [i] = input.nextInt();
            System.out.println(smallestPair(numbers));

            number_of_cases--;
        }

    }

    public static int smallestPair (int [] arr) {
        int smallest = arr[0] + arr[1] + 1;

        for (int i = 1; i < arr.length; i++) {
            for (int j = i+1; j < (arr.length + 1); j++) {

                int sum = arr[i-1] + arr[j-1]+ j - i ;
                if (sum < smallest)
                    smallest = sum;
            }

        }
        return smallest;
    }
}