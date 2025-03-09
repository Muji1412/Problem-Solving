import java.util.Scanner;

public class num1402 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (n --> 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            boolean flag = false;

            for (int i = 0; i <= b / 2; i++) {

                int tempB = b - i;
                if (tempB * i == a) {
                    flag = true;
                }
            }

            if (flag) {
                System.out.println("yes");
            }else {
                System.out.println("no");
            }
        }
    }
}
