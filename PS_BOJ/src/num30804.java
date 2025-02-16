import java.util.HashSet;
import java.util.Scanner;

public class num30804 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 받는거 - n개
        // 같은 숫자가 2개 이하여야함
        // 2개 검증은 뭘로하지그냥 해시셋으로 할까

        // 어차피 메모리 많이주니까 그냥 해시셋으로 검증 먼저 합시다

        int n = sc.nextInt();
        int[] arr = new int[n];
        HashSet set = new HashSet();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            arr[i] = a;
            set.add(a);
        }

        if (set.size() <= 2) {
            System.out.println(n);
            return;
        }

        // 이미 종류가 2개 이하인 경우는 제거했고
        // 종류가 3개 이상일때부터는 처리를 해줘야함
        // 흠 근데 어떻게하지

    }
}
