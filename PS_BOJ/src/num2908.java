
import java.util.Scanner;

public class num2908 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = changer(scanner.nextInt());
        int b = changer(scanner.nextInt());

        //Math.max() 써서 해결할것
//        if (a > b) {
//            System.out.println(a);
//        } else {
//            System.out.println(b);
//        }
//    }
        System.out.println(Math.max(a, b));
    }


    public static int changer(int a) {
        int a1 = a % 10;
        int a10 = (a % 100 - a1) / 10;
        int a100 = (a % 1000 - a10 - a1) / 100;
        return a1 * 100 + a10 * 10 + a100;
    }
}
