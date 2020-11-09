import java.util.*;
public class DopThree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        double x = in.nextDouble(), y=in.nextDouble();
        System.out.println(y < 2 - x * x && y>x || y < 2 - x * x && y<x && y > 0 ? "YES" : "NO" );
    }
}