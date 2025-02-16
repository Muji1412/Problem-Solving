
import java.util.Scanner;

public class num12755 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;

        StringBuilder sb = new StringBuilder();
        while (sb.length() < n) {
            sb.append(i);
            i++;
        }
        String s = sb.toString();
//        System.out.println(s);
        System.out.println(s.charAt(n-1));

    }
}
