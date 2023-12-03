import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.next();
        onversion(text);
    }

    public static void onversion(String S){
        String newText = "";
        for (int i = 0; i < S.length(); i++)
            newText += check(S.charAt(i));
        System.out.println(newText);
    }

    public static char check(char r){
        if (r == ',')
            return  ' ';

        if (r >= 65 && r <=90 )
            return  (char)(r + 32);

        if (r >= 97 && r <=122)
            return  (char)(r - 32);

        return r;
    }
}