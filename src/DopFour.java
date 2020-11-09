import java.util.*;
public class DopFour {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        double x = in.nextDouble(), y=in.nextDouble();
        System.out.println(y > x * x - 2 && y < -x || y > x * x - 2 && y < x ? "YES" : "NO" );
    }
}