    import java.util.Scanner;

    public class num24313 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int a1 = scanner.nextInt();
            int a2 = scanner.nextInt();
            int c = scanner.nextInt();
            int nO = scanner.nextInt();

            int answerFlag = 1;



            // f(n), c, n0가 O(n) 정의를 만족하면 1, 아니면 0을 출력한다.

            // f(n) = 7n + 7, g(n) = n, c = 8, n0 = 1이다. f(1) = 14, c × g(1) = 8이므로 O(n) 정의를 만족하지 못한다.
            // f(n) = 7n + 7, g(n) = n, c = 8, n0 = 10이다. 모든 n ≥ 10에 대하여 7n + 7 ≤ 8n 이므로 O(n) 정의를 만족한다.

            // f(n) = a1 * n + a2, c= 8, n

            for (int i = nO; i <= 100; i++) {
                if (a1 * i + a2 > c * i) {
                    answerFlag = 0;
                    break;
                }

            }
            System.out.println(answerFlag);
        }
    }
