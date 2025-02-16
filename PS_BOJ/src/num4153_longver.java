
import java.util.Arrays;
import java.util.Scanner;

public class num4153_longver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            String[] values = input.split(" ");

            long val1 = Long.parseLong(values[0]);
            long val2 = Long.parseLong(values[1]);
            long val3 = Long.parseLong(values[2]);
            long[] valueees = {val1, val2, val3};
            Arrays.sort(valueees);
            long vaal1 = valueees[0];
            long vaal2 = valueees[1];
            long vaal3 = valueees[2];

            long valv1 = vaal1 * vaal1;
            long valv2 = vaal2 * vaal2;
            long valv3 = vaal3 * vaal3;
            if (val1 == 0 && val2 == 0 && val3 == 0) {
                break;
            }
            if (valv1 + valv2 == valv3) {
                System.out.println("right");
            }
            if (valv1+ valv2 != valv3) {
                System.out.println("wrong");
            }
        }
    }
}
