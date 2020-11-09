import java.util.*;
public class DopTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        double x = in.nextDouble(), y=in.nextDouble();
        System.out.println(y < Math.sin(x) && y < 0.5 && y > 0 && x>0 && x<Math.toRadians(180) ? "YES" : "NO" );
    }
}