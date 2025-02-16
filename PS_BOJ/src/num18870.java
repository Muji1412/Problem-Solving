import java.util.Arrays;
import java.util.Scanner;

public class num18870 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] arr = new int[n];
        int[] arrCopy = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            arrCopy[i] = arr[i];
        }

//        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);

//        System.out.println(Arrays.toString(arr));



        int count = 0;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i] == arrCopy[j]) {
                    arrCopy[j] = count;
                }
            }
            if (arr[i] != arr[i+1]) {
                count++;
            }
        }


        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            sb.append(arrCopy[i]).append(" ");
        }

        System.out.println(sb);

    }
}
