
import java.util.Scanner;

public class num_30802 {
    public static void main(String[] args) {
//        23         총인원수 N
//        3 1 4 1 5 9 S M L XL XXL XXXL 인원수
//        5 7 티셔츠 묶음 수, 펜 묶음 수
        Scanner scanner = new Scanner(System.in);
        // 총인원수 받기
        int n = scanner.nextInt();
        int[] howManyWeNeed = new int[6];
        int sumWeNeed = 0;

        //사이즈별
        scanner.nextLine();
        String input = scanner.nextLine();
        String[] sizes = input.split(" ");
        int[] sizeis = new int[6];
        for (int i = 0; i<6; i++) {
            sizeis[i] = Integer.parseInt(sizes[i]);

        }


        // 각 묶음 수 받기

        String input2 = scanner.nextLine();

        // 입력값을 공백으로 나누어 배열로 변환
        String[] numbers = input2.split(" ");
        int t = Integer.parseInt(numbers[0]);
        int p = Integer.parseInt(numbers[1]);


//        23         총인원수 N
//        3 1 4 1 5 9 S M L XL XXL XXXL 인원수
//        5 7 티셔츠 묶음 수, 펜 묶음 수
        for (int i = 0; i<6; i++) {
            howManyWeNeed[i] =((sizeis[i]/t)+1) ;
            if (sizeis[i]%t==0) {
                howManyWeNeed[i] =howManyWeNeed[i]-1;
            }
            sumWeNeed +=howManyWeNeed[i];
        }
        int penNumber1 = n / p;
        int penNumber2 = n % p;
        System.out.println(sumWeNeed);
        System.out.print(penNumber1);
        System.out.print(" ");
        System.out.println(penNumber2);
    }
}
