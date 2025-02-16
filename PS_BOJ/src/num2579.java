import java.util.Scanner;

public class num2579 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int[] stair = new int[a+1];
        int[] score = new int[a+1];

        for (int i = 1; i <= a  ; i++) {
            stair[i] = sc.nextInt();
        }

        score[1] = stair[1];
        score[2] = stair[1] + stair[2];
        score[3] = Math.max(stair[1], stair[2]) + stair[3];

        for (int i = 4; i <= a; i++) {
            score[i] = Math.max(score[i - 3] + stair[i - 1], score[i - 2]) + stair[i];
        }

        System.out.println(score[a]);

    }
}
