
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class num2805_withGpt {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int treeMin = Integer.parseInt(st.nextToken());

        int[] trees = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            trees[i] = Integer.parseInt(st.nextToken());
        }

        int left = 0;
        int right = 1000000000;  // 나무의 최대 높이
        int result = 0;

        while (left <= right) {
            int mid = (left + right) / 2;
            long sum = 0;  // 잘린 나무 길이의 합

            // 각 나무에 대해 잘린 길이 계산
            for (int tree : trees) {
                if (tree > mid) {
                    sum += tree - mid;
                }
            }

            // 원하는 길이보다 크거나 같으면 높이를 높여봄
            if (sum >= treeMin) {
                result = mid;
                left = mid + 1;
            } else {  // 원하는 길이보다 작으면 높이를 낮춤
                right = mid - 1;
            }
        }

        System.out.println(result);
    }
}
