import java.util.*;
public class DopEight {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        double x = in.nextDouble(), y=in.nextDouble();
        System.out.println(y < 1 && x>0 && y > x-1 || x*x + y*y < 1 && y < x-1 ? "YES" : "NO" );
    }
}