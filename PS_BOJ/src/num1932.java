import java.util.Scanner;

public class num1932 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] arr = new int[n][n];
        int[][] dp = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i+1; j++) {
                arr[i][j] = sc.nextInt();
            }

        }

        Print2D.print2DArray(arr);

        dp[0][0] = arr[0][0];
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i+1; j++) {
                dp[i][j] = dp[i-1][j] + arr[i-1][j];
            }
        }

        Print2D.print2DArray(dp);
    }
}
