import java.util.*;
public class One {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        double a = in.nextDouble();
        System.out.println(a>=3 && a<=8 ? "true" : "false" );
    }
}
