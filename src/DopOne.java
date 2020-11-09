import java.util.*;
public class DopOne {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        double x = in.nextDouble(), y=in.nextDouble();
        System.out.println(x < 2 && y < x && x * x + y * y > 4 && y > 0 ? "YES" : "NO" );
    }
}
