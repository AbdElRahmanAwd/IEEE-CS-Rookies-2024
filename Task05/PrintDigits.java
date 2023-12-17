import java.util.Scanner;

public class PrintDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfCases = input.nextInt();
        String currentNumber;


        for (int i = 0; i < numberOfCases; i++) {
            currentNumber = input.next();
            Digits(currentNumber);
            System.out.println();
        }

    }

    public static void Digits(String S){
        if (S.length() == 0)
            return;
        Digits(S.substring(0,S.length()-1));
        System.out.print(S.charAt(S.length()-1) + " ");
    }
}