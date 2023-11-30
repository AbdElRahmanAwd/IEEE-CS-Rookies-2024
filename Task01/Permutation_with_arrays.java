import java.util.Scanner;

public class Permutation_with_arrays {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int elements = input.nextInt();
        int [] A = new int[elements];
        int [] B = new int[elements];

        for (int i = 0; i < elements; i++)
            A [i] = input.nextInt();

        for (int i = 0; i < elements; i++)
            B [i] = input.nextInt();

        permutation(A,B);
    }

    public static void permutation(int [] arr1, int [] arr2) {
        if (checkPermutation(arr1,arr2))
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    public static boolean checkDifferent(int [] arr1, int [] arr2){
        boolean check = true;

        for (int i = 0; i < arr2.length; i++) {
            if (arr1[i] != arr2[i]) {
                check = false;
                break;
            }
        }

        return check;
    }

    public static boolean checkPermutation(int [] arr1, int [] arr2) {
        boolean check = true ;

        if (checkDifferent(arr1,arr2)) {
            check = false;
        }else
            for (int i = 0; i < arr1.length; i++) {

              for (int j = 0; j < arr2.length; j++)
                  if (arr1[i] == arr2[j])
                      break;
                  else
                      check = false;

              if (check == false)
                  break;
            }

        return check;
    }
}