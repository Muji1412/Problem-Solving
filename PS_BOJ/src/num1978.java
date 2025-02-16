import java.util.Scanner;

public class num1978 {
    static int primeCount = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 스태틱 카운트값은 맨 처음에 받은 총 숫자의 개수로 만듬

        for (int i = 0; i < n; i++) {
            primeCheck(sc.nextInt());
        }

        System.out.println(primeCount);

    }
    public static void primeCheck(int n) {

        // 1은 소수가 아니므로 메서드 종료
        // 2는 소수지만 예외처리가 필요하므로 카운트를 늘려주고 메서드 종료

        if (n == 1) {
            return;
        } else if (n == 2) {
            primeCount++;
            return;
        }

        // 받은 숫자를 2부터 n-1까지 나머지를 계산하여 한번이라도 0이 나오면 소수가 아님
        // boolean을 사용하여 한번이라도 나머지값 0이 나오면 false로 바꾸고 종료
        boolean prime = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                prime = false;
                break;
            }
        }

        // 한번이라도 나머지값이 0이 되지 않아 수가 소수인 경우에는 prime이 true 이므로 소수, 카운트 늘려줌
        if (prime) {
            primeCount++;
        }
    }
}
