import java.util.Scanner;

public class Check_Code {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        byte A, B ;
        A = input.nextByte();
        B = input.nextByte();
        String code = input.next();

        checkCode(A,B,code);

    }

    public static void checkCode(int A, int B, String code){
        if (check(A, B, code))
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    public static boolean check(int A, int B, String code) {
        int count = 0;
        if (code.length() == A+B+1 && code.charAt(A) == '-') {
            for (int i = 0; i < A+B+1; i++) {
                if (i == A)
                    continue;
                else if (code.charAt(i)>=48 && code.charAt(i)<=57)
                    count++;
            }
            if (count == A+B)
                return true;
        }
        return false;
    }
}