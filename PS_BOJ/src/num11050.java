
import java.util.Scanner;

public class num11050 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int o = 1;

        for (int i = n; i > n - k; i--) {
//            System.out.println("i = " + i);
            o = o * i;
        }
        for (int j = 1; j <= k; j++) {
            o = o / j;
//            System.out.println("o = " + o);
        }
        System.out.println(o);
    }
}
