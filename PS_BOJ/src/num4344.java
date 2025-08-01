import java.util.Scanner;

public class num4344 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            int c =sc.nextInt();
            int score = 0;

            for (int j = 0; j < c; j++) {
                score += sc.nextInt();
            }

            double avg = score / c;

            }
        }
    }
