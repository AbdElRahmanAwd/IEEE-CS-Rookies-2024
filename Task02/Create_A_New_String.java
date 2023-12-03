import java.util.Scanner;

public class Create_A_New_String {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String S = input.next();
        String T = input.next();

        createString(S,T);
    }

    public static void createString(String A,String B){
        System.out.println(A.length()+" "+B.length());
        System.out.println(A+" "+B);
    }
}