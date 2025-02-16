
import java.util.Scanner;

public class num15829 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        String a = scanner.next();
        long M = 1234567891L;
        long tempHash = 0L;
        long pownow = 1L;
        int r = 31;


        int[] asc = new int[N];

        for (int i = 0; i < N; i++) {
            asc[i] = a.charAt(i)-96;
            //현재 가정 c가 들어옴, asc c = 3
            //31을 i번 제곱해서 출력해서 더해야함
            tempHash = (tempHash + pownow*asc[i])%M;
            pownow = pownow*r%M;
            }
        System.out.println(tempHash);
        }
    }

