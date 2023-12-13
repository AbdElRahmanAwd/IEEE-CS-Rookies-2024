import java.util.Scanner;

public class CommonArea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testcases = in.nextInt();
        int counter = 1;

        while (counter <= testcases) {
            int recNo = in.nextInt();
            int x1 = in.nextInt();
            int y1 = in.nextInt();
            int x2 = in.nextInt();
            int y2 = in.nextInt();
            int maxx = x1;
            int maxy = y1;
            int minx = x2;
            int miny = y2;

            for (int i = 1; i < recNo; i++) {
                int x3 = in.nextInt();
                int y3 = in.nextInt();
                int x4 = in.nextInt();
                int y4 = in.nextInt();
                maxx = Math.max(maxx, x3);
                maxy = Math.max(maxy, y3);
                minx = Math.min(minx, x4);
                miny = Math.min(miny, y4);
            }
            if (minx > maxx && miny > maxy) {
                int sum = (minx - maxx) * (miny - maxy);
                System.out.println("Case #" + counter + ": " + sum);
            } else {
                System.out.println("Case #" + counter + ": " + 0);
            }
            counter++;
        }
        in.close();
    }
}