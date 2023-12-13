import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int row1 = in.nextInt();
        int col1 = in.nextInt();
        int[][] arr1 = new int[row1][col1];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                arr1[i][j] = in.nextInt();
            }
        }
        int row2 = in.nextInt();
        int col2 = in.nextInt();
        int[][] arr2 = new int[row2][col2];
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[0].length; j++) {
                arr2[i][j] = in.nextInt();
            }
        }
        int[][] r = mul(arr1, arr2);

        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                System.out.print(r[i][j] + " ");
            }
            System.out.println();
        }
        in.close();
    }

    public static int[][] mul(int[][] arr1, int[][] arr2) {
        int[][] r = new int[arr1.length][arr2[0].length];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2[0].length; j++) {
                int sum = 0;
                for (int k = 0; k < arr1[0].length; k++) {
                    sum += arr1[i][k] * arr2[k][j];
                }
                r[i][j] = sum;
            }
        }
        return r;
    }
}
