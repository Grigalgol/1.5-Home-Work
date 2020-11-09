import java.util.*;
public class Six {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt(), c = in.nextInt();
        int s=0;
        if(a%2==0) s++;
        if(b%2==0) s++;
        if(c%2==0) s++;
        System.out.println(s>=2 ? "true" : "false");
    }
}