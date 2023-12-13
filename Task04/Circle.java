    import java.util.Scanner;

    public class Circle {
        public static void main(String[] args) {
            Scanner in=new Scanner(System.in);
            //for circle A
            int x1=in.nextInt();
            int y1=in.nextInt();
            int x2=in.nextInt();
            int y2=in.nextInt();
            int xa=(x1+x2)/2;
            int ya=(y1+y2)/2;
            int reduis1=(int)Math.sqrt(Math.pow(xa-x1, 2)+Math.pow(ya-y1, 2));
            
            //for circle B
            int x3=in.nextInt();
            int y3=in.nextInt();
            int x4=in.nextInt();
            int y4=in.nextInt();
            int xb=(x3+x4)/2;
            int yb=(y3+y4)/2;
            int reduis2=(int)Math.sqrt(Math.pow(xb-x3, 2)+Math.pow(yb-y3, 2));

            int reduis12=(int)Math.sqrt(Math.pow(xb-xa, 2)+Math.pow(yb-ya, 2));
            
            if(reduis12>=(reduis2+reduis1) && reduis1>=reduis2) {
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
            in.close();
        }
    }
