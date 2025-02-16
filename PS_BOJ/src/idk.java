
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class idk {
    static int sumNow;
    static int minusPlus = 0;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] arr = input.split("");

        // 숫자들을 하나씩 처리
        for (int i = 0; i < arr.length; i++) {
            // +, - 를 제외하고는 전부 숫자
            if (!arr[i].equals("+") && !arr[i].equals("-")) {
                sb.append(arr[i]);
                continue;
            }

            // 연산자 나온 경우에는 +,- 나왔는지 여부에 따라 계산
            int num = Integer.parseInt(sb.toString());
            if (minusPlus == 0) {
                sumNow += num;
            } else {
                sumNow -= num;
            }
            sb.setLength(0);

            // 마이너스를 만나면 상태 변경
            if (arr[i].equals("-")) {
                minusPlus = 1;
            }
        }
        // for문을 전부 돌리고 나면 스트링빌더에 숫자만 하나 덩그라니 남음
        // 고로 마지막 남은 값을 처리해줘야함
        int lastNum = Integer.parseInt(sb.toString());
        if (minusPlus == 0) {
            sumNow += lastNum;
        } else {
            sumNow -= lastNum;
        }

        System.out.println(sumNow);
    }
}
