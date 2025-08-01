import java.util.Scanner;

public class num1182 {
    static int[] arr;
    static int n, s, count;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        s = sc.nextInt();


        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        count = 0;
        solve(0, 0, 0);


        System.out.println(count);


    }
    // 0번째, sum 0, 선택된 카운트개수
    // 재귀로 돌림, idx는 모든 수를 다 카운트 했는지,
    // sum은 s와 동일한지, selected가 된게 1개 이상인지 체크

    static void solve(int idx, int sum, int selectedCount) {
        if (idx == n) {
            if (selectedCount > 0 && sum == s) {
                count++;
            }
            return;
        }

        // '현재 내 위치의 수를 추가하지 않겠다'
        // 다음 수로 이동은 하지만, 이번에 있는 수는 선택하지 않음.
        solve(idx + 1, sum, selectedCount);

        // '현재 내 위치의 수를 추가하겠다.
        // 다음 수로 이동하며, 이번에 있는 수를 선택,
        solve(idx + 1, sum + arr[idx], selectedCount + 1);

        // 이 두개의 재귀문이 2^n번 계산되며, 카운팅해줌.

    }
}
