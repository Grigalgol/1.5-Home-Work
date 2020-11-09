import java.util.*;
public class Two {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        double a = in.nextDouble();
        System.out.println(a>=-3 && a<=5 || a>=9 && a<=15 ? "true" : "false" );
    }
}