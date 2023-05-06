import java.util.*;
import java.lang.Math;

public class r2 {
    public static void main(String ar[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int r = 0;
        for (int i = a; i <= b; i++) {
            if (i == 1) {
                continue;
            }
            int c = 0;
            int sq = (int) Math.pow(i, 0.5);
            for (int j = 1; j <= sq; j++) {
                if (i % j == 0) {
                    c++;
                }
            }
            if (c == 1) {
                r++;
            }
            c = 0;
        }
        System.out.println(r);
    }
}