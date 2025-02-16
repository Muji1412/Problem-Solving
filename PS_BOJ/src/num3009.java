import java.util.Scanner;

public class num3009 {
    public static void main(String[] args) {
        //세 점이 주어졌을 때, 축에 평행한 직사각형을 만들기 위해서 필요한 네 번째 점을 찾는 프로그램

        //같은 점 하나는 항상 주어짐. 그걸 기점으로 만들어야 함

        // a        b


        // c        d

        // 점이 어디든간에 무조건 같은 점 이랑 같은 좌표 하나 나오게 돼있음

        // 경우의 수 2개
        // 1. 기준점 기준으로 같은값 두개줄때 (같은점 2개 제외하고, a = b, b = a) 일때,
        // 2. 기준점 기준으로 다른값 두개줄때 (같은점 2개 제외하고, a != b || b != a

        Scanner scanner = new Scanner(System.in);

        int mainX;
        int mainY;

        int ax = scanner.nextInt();
        int ay = scanner.nextInt();

        int bx = scanner.nextInt();
        int by = scanner.nextInt();

        int cx = scanner.nextInt();
        int cy = scanner.nextInt();

        if (ax == bx) {
            ax = 0;
            bx = 0;

        } else if (ax == cx) {
            ax = 0;
            cx = 0;

        } else if (bx == cx) {
            bx = 0;
            cx = 0;
        }

        if (ay == by) {
            ay = 0;
            by = 0;

        } else if (ay == cy) {
            ay = 0;
            cy = 0;

        } else if (by == cy) {
            by = 0;
            cy = 0;
        }

        mainX = ax + bx + cx;
        mainY = ay + by + cy;

        System.out.println(mainX + " " + mainY);



    }
}
