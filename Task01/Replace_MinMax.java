import java.util.Scanner;

public class Replace_MinMax {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int count = input.nextInt();
        int [] numbers = new int[count];

        for (int i = 0; i < numbers.length; i++) {
            numbers [i] = input.nextInt();
        }
        replaceMinMax(numbers);
    }

    public static void replaceMinMax(int [] arr) {
        int indexMax,indexMin,temp;
        indexMin = 0;
        indexMax = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[indexMax]< arr[i])
                indexMax = i;
            else if (arr[indexMin] > arr[i])
                indexMin = i;
        }

        temp = arr[indexMax];
        arr[indexMax] = arr[indexMin];
        arr[indexMin] = temp;

        for (int n:arr)
            System.out.print(n+" ");
    }
}