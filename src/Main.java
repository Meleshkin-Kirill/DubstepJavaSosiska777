import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];

        int res = 1;

        a[0] = in.nextInt();
        for(int i = 1; i < n; i++){
            a[i] = in.nextInt();
            if(a[i] > a[i - 1]) res += 1;
        }

        System.out.println(res);
    }
}