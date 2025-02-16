import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class num1012_BFSwithQueue {

    // 재귀용 맵, 불린, 거리..값?
    static boolean[][] visted;
    static int[][] map;

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
                    if (map[i][j] == 1 && !visted[i][j]) {
                        DFSusingQueue(i, j);
                        count++;
                    }
                }
            }
            sb.append(count + "\n");
        }

        System.out.println(sb);
    }

    public static void DFSusingQueue(int i, int j) {
        visted[i][j] = true;

        //dir로 리팩토링

        int[] dirI = {0, 0, 1, -1};
        int[] dirJ = {1, -1, 0, 0};

        // Queue로 리팩토링 (DFS)

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{i, j});
        visted[i][j] = true;

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int curI = cur[0];
            int curJ = cur[1];

            // 네방향 탐색

            for (int k = 0; k < 4; k++) {
                int nextI = curI + dirI[k];
                int nextJ = curJ + dirJ[k];
                if (rangeCheck(nextI, nextJ) && !visted[nextI][nextJ] && map[nextI][nextJ] == 1) {
                    queue.offer(new int[] {nextI, nextJ});
                    visted[nextI][nextJ] = true;
                }
            }
        }
    }
    public static boolean rangeCheck(int i, int j) {
        return i >= 0 && i < N && j >= 0 && j < M;
    }
}





