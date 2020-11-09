import java.util.*;
public class DopNine {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        double x = in.nextDouble(), y=in.nextDouble();
        System.out.println(x*x + y*y < 1 || x*x + y*y > 1 && x<1 && y<1 && x>0 && y>0 ? "YES" : "NO" );
    }
}