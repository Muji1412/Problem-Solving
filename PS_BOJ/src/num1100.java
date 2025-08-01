import java.util.Scanner;

public class num1100 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] chess = new char[8][8];

        for (int i = 0; i < 8; i++) {
            String s = sc.next();
            for (int j = 0; j < 8; j++) {
                chess[i][j] = s.charAt(j);
            }
        }

        int count = 0;

        // 맨 왼 위쪽은 white 라고 가정함, 0이라고 침
        int flag = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {

                // F가 있고 플래그가 흰색인 경우
                if (chess[i][j] == 'F' && flag == 0) {
                    count++;
                }

                // 흑백돌리기
                if (flag == 0) {
                    flag = 1;
                } else {
                    flag = 0;
                }
            }
            // 흑백돌리기 - 이게 없으면 그냥 01010101 반복임. 다음줄을 위해 변경
            if (flag == 0) {
                flag = 1;
            } else {
                flag = 0;
            }
        }

        System.out.println(count);
    }
}
