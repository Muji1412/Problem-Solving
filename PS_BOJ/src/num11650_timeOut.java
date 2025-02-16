import java.util.Scanner;

public class num11650_timeOut {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        String[] stringArr = new String[n];

        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            stringArr[i] = x + " " + y;
        }

        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if (stringToNumber(stringArr[i])[0] > stringToNumber(stringArr[j])[0]) {

                    String temp = stringArr[i];
                    stringArr[i] = stringArr[j];
                    stringArr[j] = temp;
                }else if (stringToNumber(stringArr[i])[0] == stringToNumber(stringArr[j])[0]){
                    if (stringToNumber(stringArr[i])[1] > stringToNumber(stringArr[j])[1]) {
                        String temp = stringArr[i];
                        stringArr[i] = stringArr[j];
                        stringArr[j] = temp;
                    }
                }



            }
        }
//        System.out.println(Arrays.toString(stringArr));

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            sb.append(stringArr[i]).append("\n");
        }

        System.out.println(sb);

    }

    static int[] stringToNumber(String str) {
        String[] arr = str.split(" ");
        int[] arr2 = new int[2];
        arr2[0] = Integer.parseInt(arr[0]);
        arr2[1] = Integer.parseInt(arr[1]);

        // 생각해보니까 이따구로 짜버리면 4,-50 이럴때 무조건 오류남
//        return x * 10 + y;

        return arr2;
    }
}
