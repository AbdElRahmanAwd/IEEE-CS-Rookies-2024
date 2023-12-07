import java.util.Scanner;

public class FiveinOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int [] A = new int[N];

        for (int i = 0; i < A.length; i++)
            A [i] = input.nextInt();

        System.out.println("The maximum number : " + maximum(A));
        System.out.println("The minimum number : " + minimum(A));
        System.out.println("The number of prime numbers : " + primeNumbers(A));
        System.out.println("The number of palindrome numbers : " + palindromeNumbers(A));
        System.out.println("The number that has the maximum number of divisors : " + maximumDivisors(A));
    }

    public static int maximum(int [] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++)
            if (max < arr[i])
                max = arr[i];

        return max;
    }

    public static int minimum (int [] arr) {
        int min = arr[0];

        for (int i = 1; i < arr.length; i++)
            if (min > arr[i])
                min = arr[i];

        return min;
    }

    public static int primeNumbers(int [] arr) {
        int prim = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= 1)
                continue;

            boolean check = true;

            for (int j = 2; j <= Math.sqrt(arr[i]); j++)
                if (arr[i]%j == 0){
                    check = false;
                    break;
                }

            if (check)
                prim++;
        }

        return prim;
    }

    public static int palindromeNumbers(int [] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++)
            if (palindrome(arr[i]))
                count++;
        
        return count;
    }

    private static boolean palindrome(int num) {
        int originalNum = num;
        int reversedNum = 0;

        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }

        return originalNum == reversedNum;
    }

    public static int maximumDivisors(int [] arr) {
        int maxDivisors = 0;
        int number = 0;

        for (int i = 0; i < arr.length; i++) {
            if (maxDivisors < divisors(arr[i])) {
                maxDivisors = divisors(arr[i]);
                number = arr[i];
            } else if (maxDivisors == divisors(arr[i])) {
                if (number < arr[i])
                    number = arr[i];
            }
        }

        return number;
    }

    private static int divisors(int N) {
        int divisors = 0;

        for (int i = 1; i <= Math.sqrt(N); i++)
            if (N%i == 0) {
                if (i == Math.sqrt(N))
                    divisors++;
                else
                    divisors += 2;
            }


        return divisors;
    }

}