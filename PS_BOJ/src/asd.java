import java.util.Scanner;

public class asd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputs = new String[3];
        for (int i = 0; i < 3; i++) {
            inputs[i] = scanner.nextLine().trim();
        }

        // 마지막 숫자를 찾기 위한 변수
        int lastNumber = -1;

        // 입력 문자열을 분석하여 마지막 숫자를 찾음
        for (String input : inputs) {
            if (input.equals("Fizz")) {
                // Fizz는 3의 배수
                continue;
            } else if (input.equals("Buzz")) {
                // Buzz는 5의 배수
                continue;
            } else if (input.equals("FizzBuzz")) {
                // FizzBuzz는 3과 5의 배수
                continue;
            } else {
                // 숫자 그대로 변환
                lastNumber = Integer.parseInt(input);
            }
        }

        // 다음 숫자 계산
        lastNumber++;

        // FizzBuzz 규칙에 따라 출력
        if (lastNumber % 3 == 0 && lastNumber % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (lastNumber % 3 == 0) {
            System.out.println("Fizz");
        } else if (lastNumber % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(lastNumber);
        }

        scanner.close();
    }
}