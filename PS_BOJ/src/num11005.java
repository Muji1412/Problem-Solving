import java.util.Scanner;

public class num11005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int B = scanner.nextInt();

        String result = Integer.toString(N, B).toUpperCase();

        System.out.println(result);
    }
}
