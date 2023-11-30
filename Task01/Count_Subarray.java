import java.util.Scanner;

public class Count_Subarray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        byte number_of_cases = input.nextByte();

        while (number_of_cases>0) {
            byte count = input.nextByte();
            int [] Numbers = new int[count];
            for (int i = 0; i < Numbers.length; i++)
                Numbers[i] = input.nextInt();

            System.out.println(countSubarray(Numbers));

            number_of_cases--;
        }
    }

    public static int countSubarray (int [] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            int max = arr[i];
            count++;

            for (int j = i+1; j < arr.length; j++) {
                if (max < arr[j]){
                    max = arr[j];
                    count++;
                } else
                    break;
            }
        }
        return count;
    }
}