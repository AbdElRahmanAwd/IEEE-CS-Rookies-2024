import java.util.Scanner;


public class ConvertTOBase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int conversionType = in.nextInt();
        String number = in.next();
        int base = in.nextInt();

        if (conversionType == 1) {
            // Convert from base X to decimal
            int decimalNumber = Integer.parseInt(number, base);
            System.out.println(decimalNumber);
        } else if (conversionType == 2) {
            // Convert from decimal to base X
            int decimalNumber = Integer.parseInt(number);
            String convertedNumber = Integer.toString(decimalNumber, base).toUpperCase();
            System.out.println(convertedNumber);
        }

        in.close();
    }
}