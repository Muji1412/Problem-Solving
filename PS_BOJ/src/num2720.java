import java.util.Scanner;

public class num2720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //쿼터 25 다임 10 니켈 5 페니 1

        int n = sc.nextInt();
        int Q = 0;
        int D = 0;
        int N = 0;
        int P = 0;

        for (int i = 0; i < n; i++) {
            int temp;
            int C = sc.nextInt();
//            System.out.println("C = " + C);
            Q = C/25;
            temp = C%25;
//            System.out.println(temp);
            D = temp/10;
            temp = temp%10;
//            System.out.println(temp);
            N = temp/5;
            temp = temp%5;
//            System.out.println(temp);
            P = temp/1;

            System.out.print(Q + " " + D + " " + N + " " + P );
            System.out.println();

        }
    }
}
