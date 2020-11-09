import java.util.*;
public class Five {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt(), c = in.nextInt(), d = in.nextInt();
        System.out.println((a * -1==b) || (a * -1 == c) || (a * -1 == d) || (b * -1 == c) || (b * -1 == d) || (c* -1== d)  ? "true" : "false" );
    }
}