import java.util.Scanner;

public class num10818 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min ;
        int max ;
        int n = scanner.nextInt();
        int[] nums = new int[n];

        // 입력값들 받는 파트
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        //최대값 찾기
        max = nums[0];
        min = nums[0];
        for (int i = 0; i < n; i++) {
            if (max < nums[i]) {
                max = nums[i];
            }
            if (min > nums[i]) {
                min = nums[i];
            }
        }
        System.out.print(min);
        System.out.print(" ");
        System.out.print(max);
    }
}