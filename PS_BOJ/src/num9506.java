import java.util.Scanner;

public class num9506 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            int n = scanner.nextInt();
            if (n == -1) {
                break;
            }

            int sum = 0;
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    sum += i;
                }
            }
            if (sum == n) {
                System.out.print("12 = ");
            } else {
                System.out.println(n + " is NOT perfect.");
            }
        }
        }
}
