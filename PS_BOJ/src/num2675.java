
import java.util.Scanner;

public class num2675 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int testCase = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < testCase; i++) {
            String input = scanner.nextLine();

            //공백으로 분리하기
            String[] parts = input.split(" ");

            //입력 받은 숫자/문자로 나누기
            int num = Integer.parseInt(parts[0]); // 5 /HTP 입력시 5
            String[] arrayList ;

            String langs = parts[1]; // 5 /HTP 입력시 /HTP

            //문자들 어레이로 돌려서 스플릿으로 어레이리스트 새로 만들기
            arrayList = langs.split(""); //

            //나눈 문자들 반복하기. num번 반복해서 print로 써내면 될듯?
            for (int j = 0; j < arrayList.length; j++) {
                for (int k = 0; k < num; k++) {
                    System.out.print(arrayList[j]);
                }// 안된 이유는 j값을 num으로 잡아버림. j는 문자의 길이가 반복돼야했는데, 반복할 횟수로 넣음
            }
            System.out.println();
        }
    }
}
