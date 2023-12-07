import java.util.Scanner;

public class SwappingWithMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int X = input.nextInt();
        int Y = input.nextInt();
        int [][] A= new int[N][N];

        for (int i = 0; i < A.length; i++)
            for (int j = 0; j < A[i].length; j++)
                A [i][j] = input.nextInt();

        swapping(A,X,Y);
    }


    public static void swapping(int [][] A, int X, int Y) {
        for (int i = 0; i < A.length; i++) {
            if (i == Math.min(X,Y)-1)
                i = Math.max(X,Y)-1;
            else if (i == Math.max(X,Y)-1)
                i = Math.min(X,Y)-1;

            for (int j = 0; j < A[i].length; j++){
                if (j == Math.min(X,Y)-1){
                    System.out.print(A [i][Math.max(X,Y)-1] + " ");
                    continue;
                }
                else if (j == Math.max(X,Y)-1){
                    System.out.print(A [i][Math.min(X,Y)-1] + " ");
                    continue;
                }
                System.out.print(A[i][j] + " ");
            }

            System.out.println();

            if (i == Math.min(X,Y)-1)
                i = Math.max(X,Y)-1;
            else if (i == Math.max(X,Y)-1)
                i = Math.min(X,Y)-1;
        }
    }
}