import java.io.BufferedReader;
import java.io.IOException;

public class num1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new java.io.InputStreamReader(System.in));

        String[] input = reader.readLine().split("");
        int[] arr = new int[input.length];

        for (int i = 0; i < input.length; i++) {
//            System.out.println(input[i]);
            arr[i] = Integer.parseInt(input[i]);
        }

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] < arr[j]) { // 뒤에거가 크면 앞으로 가져오는거니까 내림차순 <-> 오름차순 바뀌는 이유
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
        }

        System.out.println(sb);
    }
}
