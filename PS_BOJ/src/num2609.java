
import java.util.Scanner;

public class num2609 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int ab = a * b;
        int temp = 0;

        while (b != 0) {
            temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println(a);
        int lcm = ab / a;
        System.out.println(lcm);
    }
}
