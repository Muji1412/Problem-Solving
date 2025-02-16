
import java.util.Scanner;

public class num4153 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            String[] values = input.split(" ");

            int val1 = Integer.parseInt(values[0]);
            int val2 = Integer.parseInt(values[1]);
            int val3 = Integer.parseInt(values[2]);

            int valv1 = val1 * val1;
            int valv2 = val2 * val2;
            int valv3 = val3 * val3;

            if (valv1 == 0 && valv2 == 0 && valv3 == 0) {
                break;
            }
            if (valv1 + valv2 == valv3) {
                System.out.println("right");
            }
            else {
                System.out.println("wrong");
            }
        }
    }
}
