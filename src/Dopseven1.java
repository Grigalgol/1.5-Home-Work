import java.util.*;
public class Dopseven1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        double x = in.nextDouble(), y=in.nextDouble();
        System.out.println(y > 2 * x * x && y > 1 - x && x < 1 || y < 2 * x * x && y > 1 - x && x < 1 && x>0 ? "YES" : "NO" );
    }
}