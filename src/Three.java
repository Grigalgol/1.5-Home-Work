import java.util.*;
public class Three {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        double a = in.nextDouble();
        System.out.println(a>=-2 && a<=3 || a>=6 && a<=9 ? "false" : "true" );
    }
}