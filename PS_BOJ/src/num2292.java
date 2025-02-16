
import java.util.Scanner;

public class num2292 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long N = scanner.nextLong();

        long answer = honey(N);

        System.out.println(answer);




    }

    public static long honey(long n) {
        long result = 1L;
        long i = 0L;
        long honeyCount=0L;
        long honeyPlus1=0L;

        while (honeyPlus1 < n) {

            //맞는거였는데, 7인 경우에는 2를 출력해줘야함. 근데 이하로 설정해서 이상하게 나옴
            //허니플러스1에서 7인 경우에는 더 진행되면 안되는데, 이하로 설정해서 한번 더해버림.

            i=i+6;
            honeyCount = honeyCount + i;
            honeyPlus1 = honeyCount + 1;
//            System.out.println("i = " + i);
//            System.out.println("honeyCount = " + honeyCount);
//            System.out.println("honeyPlus1 = " + honeyPlus1);
            result++;
            }
        if (n == 1) {
            result = 1;
        }
        return result;
        }
    }

