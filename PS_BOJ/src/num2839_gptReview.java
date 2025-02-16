
import java.util.Scanner;

public class num2839_gptReview {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();


        // 상근이는 요즘 설탕공장에서 설탕을 배달하고 있다. 상근이는 지금 사탕가게에 설탕을 정확하게 N킬로그램을 배달해야 한다.
        // 설탕공장에서 만드는 설탕은 봉지에 담겨져 있다. 봉지는 3킬로그램 봉지와 5킬로그램 봉지가 있다.

        // 상근이는 귀찮기 때문에, 최대한 적은 봉지를 들고 가려고 한다. 예를 들어, 18킬로그램 설탕을 배달해야 할 때,
        // 3킬로그램 봉지 6개를 가져가도 되지만, 5킬로그램 3개와 3킬로그램 1개를 배달하면, 더 적은 개수의 봉지를 배달할 수 있다.

        // 상근이가 설탕을 정확하게 N킬로그램 배달해야 할 때, 봉지 몇 개를 가져가면 되는지 그 수를 구하는 프로그램을 작성하시오.


        // 함수명은 제대로 지을것
        int minbags = Integer.MAX_VALUE;



        // 굳이 for문 두번 돌릴 필요 없이, 한번만 돌린 이후 % 3 == 0에 부합하면 계산해주기
        for (int i = 0; i <= n/5; i++) {
            int remain = n-5*i; // 5kg 사용 후 남은 무게

            // for문 돌릴필요 없음 - 시간복잡도 줄일수있음
            if (remain % 3 == 0) {
                int nThree = remain/3;
                minbags = Math.min(minbags, (i+nThree));
            }
        }

        // 이후에 인티저 맥스밸류면 그냥 -1뱉게 만들기
        if (minbags == Integer.MAX_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(minbags);
        }





    }
}
