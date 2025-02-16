
import java.util.Scanner;

public class num2231 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int smolSum = 0;
        int answer = Integer.MAX_VALUE;

        // n = 256 받음
        String input = scanner.nextLine();
        int n = Integer.parseInt(input);

        for (int i = n; i >= 0; i--) {
            // 256 = 255+2+5+5 면 그 값 찾는 방법 만들기
            String strI = String.valueOf(i);
            String[] tempHere = strI.split("");
            smolSum = 0;
            for (String s : tempHere) {
                smolSum += Integer.parseInt(s);
            }
            if (i + smolSum == n) {
                if (i < answer) {
                    answer = i;
                }
            }
        }

        // 최저값 출력
        if (answer != Integer.MAX_VALUE) {
            System.out.println(answer);
        } else {
            System.out.println("분해합을 찾지 못했습니다.");
        }
    }
}

