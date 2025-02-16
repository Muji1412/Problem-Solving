import java.util.Scanner;

public class num2745 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String N = scanner.next();
        int B = scanner.nextInt();

        int value = Integer.parseInt(N, B);

        System.out.println(value);
        
    }
}
