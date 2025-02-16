
import java.util.Scanner;

public class num1259 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int counter= 0;
            String input = scanner.nextLine();
            int[] array = new int[input.length()];

            for (int i = 0; i<input.length();i++) {
                array[i] = Character.getNumericValue(input.charAt(i));
//                System.out.println("array[i] = " + array[i]);
            }

            if (input.length() % 2 ==0 ||input.length() % 2 ==1) {
                for (int j = 0 ; j<input.length()/2;j++) {
//                        System.out.println("(input.length()-j) = " + (input.length()-j));
                    if (array[j] == array[(input.length() - j-1)]) {
//                            System.out.println("counter ++");
                            counter++;
                    } else {
//                            System.out.println("no");
                    }
                }
            }

            if (input.equals("0")) {
                break;
            }
            if (counter == input.length() / 2) {
                System.out.println("yes");
//                System.out.println("입력값 " + input + " 은 팰런드롬수입니다 카운터수" + counter);
            } else {
                System.out.println("no");
//                System.out.println("그기 아닌디요 카운터수" + counter );
            }

        }
    }
}
