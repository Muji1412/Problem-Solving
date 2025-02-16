import java.util.Scanner;

public class num9063 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // 오늘 배운것
        // 인티저 미니멈/맥스 밸류는 인티저에서 표현할수있는 최소/최대값을 넣어준다
        int maxA = Integer.MIN_VALUE;
        int maxB = Integer.MIN_VALUE;
        int minA = Integer.MAX_VALUE;
        int minB = Integer.MAX_VALUE;

        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            if (maxA < a) {
                maxA = a;
            }
            if (minA > a || minA ==0) {
                minA = a;
            }
            if (maxB < b) {
                maxB = b;
            }
            if (minB > b || minB == 0) {

                minB = b;
            }
        }
//        System.out.println("maxA = " + maxA);
//        System.out.println("maxB = " + maxB);
//        System.out.println("minA = " + minA);
//        System.out.println("minB = " + minB);
        System.out.println((maxA-minA) * (maxB-minB));
    }
}
