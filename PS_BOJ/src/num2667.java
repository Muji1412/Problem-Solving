
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class num2667 {
    static int M;
    static int counter = 0;

    static boolean[][] visited;
    static int[][] arr;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        // 정사각형임
        // 시간 짧아서 그냥 카운터로 세주면서 해야할거같음

        // dfs든 bfs든 만들어두고, 이중for문으로 탐색시키되, 1이 나올때마다 체크하는 방식이 맞을듯?
        // 시간 많으면 그냥 이중포문 두번 돌려도 되긴 하는데 안될거같음

        // 애초에 이중포문 두번인데 세번까지 돌리는건 무리?인가?

        M = a;
        visited = new boolean[M + 1][M + 1];
        arr = new int[M + 1][M + 1];

        String str;

        for (int i = 1; i < M + 1; i++) {
            str = br.readLine();
            for (int j = 1; j < M + 1; j++) {
                arr[i][j] = Integer.parseInt(String.valueOf(str.charAt(j - 1)));
            }
        }

        int howManyHouses = 0;
        int[] houseCounter = new int[99999];

        int flag = 0;


        // 출력은 오름차순으로 해야함
        for (int i = 1; i < M + 1; i++) {
            for (int j = 1; j < M + 1; j++) {
                if (arr[i][j] == 1) {
                    howManyHouses++;
                    counter = 0;
                    bfs(i, j);
                    flag = 1;
                }
                if (flag == 1) {
                    houseCounter[howManyHouses] = counter;
                    flag = 0;
                }
            }
        }
        Arrays.sort(houseCounter);


        System.out.println(howManyHouses);
        for (int val : houseCounter) {
            if (val != 0) {
                System.out.println(val+1);
            }
        }

    }

    public static void bfs(int i, int j) {
        int[] dirX = {-1, 1, 0, 0};
        int[] dirY = {0, 0, -1, 1};



        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{i, j});
        visited[i][j] = true;
        arr[i][j] = 2;

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int curI = cur[0];
            int curJ = cur[1];

            for (int k = 0; k < 4; k++) {
                int newI = curI + dirX[k];
                int newJ = curJ + dirY[k];

                if (rangeCheck(newI,newJ) && !visited[newI][newJ]&& arr[newI][newJ] == 1) {
                    q.offer(new int[]{newI, newJ});
                    arr[newI][newJ] = 2;
                    visited[newI][newJ] = true;
                    counter++;
                }

            }
        }
    }

    public static boolean rangeCheck(int i, int j) {
        if (i < 1 || i > M || j < 1 || j > M) {
            return false;
        }
        return true;
    }
}
