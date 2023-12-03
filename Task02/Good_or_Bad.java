import java.util.Scanner;

public class Good_or_Bad {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String [] numbers = new String[n];

        for (int i = 0; i < n; i++)
            numbers [i] = input.next();

        goodOrBad(numbers);

    }

    public static void goodOrBad(String [] array){
        for (int i = 0; i < array.length; i++){
            if (array[i].contains("101") || array[i].contains("010"))
                System.out.println("Good");
            else
                System.out.println("Bad");
        }
    }
}