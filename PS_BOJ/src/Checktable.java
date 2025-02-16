
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Checktable {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        HashMap<Integer, String> map = new HashMap<>();

        String[] strArr = new String[n];
        int[] intArr = new int[n];

        for (int i = 0; i < n; i++) {

            String s = sc.next();
            map.put(i, s);

        }

        System.out.println(map.get(3));
        System.out.println(map.get(24));
        System.out.println(map.get(25));


    }
}
