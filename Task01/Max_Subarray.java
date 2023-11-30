import java.util.Scanner;

public class Max_Subarray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        byte number_of_cases = input.nextByte();

        while (number_of_cases>0) {
            byte count = input.nextByte();
            int [] Numbers = new int[count];
            for (int i = 0; i < Numbers.length; i++)
                Numbers[i] = input.nextInt();
            Max_Subarray(Numbers);

            number_of_cases--;
        }
    }

    public static void Max_Subarray (int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            int max = arr[i];
            System.out.print(max+" ");

            for (int j = i+1; j < arr.length; j++) {
                if (max < arr[j])
                    max = arr[j];
                System.out.print(max+" ");
            }
        }
        System.out.println();
    }
}