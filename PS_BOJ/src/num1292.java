
import java.util.Scanner;

public class num1292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = 0;

        int[] arr = new int[Integer.MAX_VALUE];

        int temp = 1;
        int index = 1;
        for (int i = 1; i < b; i++) {
            for (int j = 0; j < i; j++) {
                arr[index] = i;
//                System.out.println(arr[index]);
                index++;
            }
        }
        for (int i = a; i <= b; i++) {
            sum += arr[i];
        }

        System.out.println(sum);
    }
}
