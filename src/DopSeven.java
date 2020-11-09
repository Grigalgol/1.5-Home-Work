import java.util.*;
public class DopSeven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        double x = in.nextDouble(), y=in.nextDouble();
        System.out.println(x * x + y * y < 1 && y > -x || x * x + y * y < 1 && y < -x && y < x ? "YES" : "NO" );
    }
}