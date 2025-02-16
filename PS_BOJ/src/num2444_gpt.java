import java.util.Scanner;

public class num2444_gpt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        // 상단 부분 출력
        for (int i = 1; i <= n; i++) {
            printLine(n - i, 2 * i - 1);
        }

        // 하단 부분 출력
        for (int i = n - 1; i >= 1; i--) {
            printLine(n - i, 2 * i - 1);
        }
    }

    // 공백과 별을 출력하는 함수
    private static void printLine(int spaces, int stars) {
        for (int j = 0; j < spaces; j++) {
            System.out.print(" ");
        }
        for (int k = 0; k < stars; k++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
