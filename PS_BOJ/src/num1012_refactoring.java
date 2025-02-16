import java.util.Scanner;

public class num1012_refactoring {

    // 재귀용 맵, 불린, 거리..값?
    static boolean[][] visted;
    static int map[][];

    // 사용할 값들
    static int N, M, K;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int TestCase = sc.nextInt();

        int count = 0;

        StringBuilder sb = new StringBuilder();

        while (TestCase-- > 0) {
            count = 0;
            N = sc.nextInt();
            M = sc.nextInt();
            K = sc.nextInt();



            // 받는값 0 0, 1 0 , 이런애들 죄다 맵 안에 값을 1로 만들어줘야함
            map = new int[N][M];
            visted = new boolean[N][M];
            for (int i = 0; i < K; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                map[a][b] = 1;
                }
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (map[i][j] == 1 && visted[i][j] == false) {
                        DFS(i, j);
                        count++;
                    }
                }
            }
            sb.append(count + "\n");
        }

        System.out.println(sb);
    }

    public static void DFS(int i, int j) {
        visted[i][j] = true;

        //dir로 리팩토링

        int[] dirI = {0, 0, 1, -1};
        int[] dirJ = {1, -1, 0, 0};
        for (int a = 0; a < 4; a++) {
            int nextI = i + dirI[a];
            int nextJ = j + dirJ[a];
            if (rangeCheck(nextI, nextJ) && map[nextI][nextJ] == 1 && visted[nextI][nextJ] == false) {
                DFS(nextI, nextJ);
            }
        }
    }
    public static boolean rangeCheck(int i, int j) {
        if (i < 0 || i >= N || j < 0 || j >= M) {
            return false;
        }
        return true;
    }
}





