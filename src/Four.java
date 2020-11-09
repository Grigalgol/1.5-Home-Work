import java.util.*;
public class Four {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println(a>=100 && a<=999 && a%5==0 ? "true" : "false" );
    }
}