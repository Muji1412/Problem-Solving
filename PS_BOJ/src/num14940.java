import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class num14940 {
    // 쓸 변수들
    static int N;
    static int M;
    static int count = 1;

    // 쓸 배열, 불린
    static int[][] arr;
    static boolean[][] visited;
    static int[][] dist;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());



        arr = new int[N + 1][M + 1];
        visited = new boolean[N + 1][M + 1];
        dist = new int[N + 1][M + 1];

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= M; j++) {
                dist[i][j] = -1;
            }
        }

        int startI = 0;
        int startJ = 0;


        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= M; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if (arr[i][j] == 2) {
                    startI = i;
                    startJ = j;
                }
            }
        }

        arr[startI][startJ] = 0;
        printArray2D(arr);
        bfs(startI, startJ);
        printArray2D(dist);


        // 시작점 2는 스타트 i 스타트j로 잡아놨음



        //bfs를 사용하는 문제

        // 문제에는 2를 도착 지점으로 설정했지만, 2를 시작 지점으로 생각하면 됨
        // 0은 갈 수 없는곳, 1은 갈 수 있는곳

        // 방향은 dir로 4방향 조회, 간 곳은 가지 않고, 배열 밖으로 튀어나가지 않는 메서드 필요
        // 조건, 4방향 조회했을때, visited[][] 가 false이고, 배열 밖으로 튀어나가지 않으며, 갈수있는 땅인 "1" 일 때만 진출 가능
        // 이건 bfs로 구현해야하므로, 큐로 구현해야함
        // while문으로 돌리돼, 지금 내가 bfs에서 몇번째 단계에 있는지 구분할려면 스태틱 카운트?


    }
    public static void bfs(int i, int j) {

        // 4방향 조회하기
        // 4방향 조회하고나면 카운트 +1 해주기?
        int[] dirX = {-1, 1, 0, 0};
        int[] dirY = {0, 0, -1, 1};

        //큐에 넣어서 해결해야함
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{i, j});



        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int curI = cur[0];
            int curJ = cur[1];

            for (int k = 0; k < 4; k++) {
                int nextI = curI + dirX[k];
                int nextJ = curJ + dirY[k];

                if (rangeCheck(nextI, nextJ) && !visited[nextI][nextJ] && arr[nextI][nextJ] != 0) {
                    visited[nextI][nextJ] = true;
                    dist[nextI][nextJ] = dist[curI][curJ] + 1;
                    q.offer(new int[]{nextI, nextJ, dist[nextI][nextJ]});
                }
            }
        }

    }
    public static boolean rangeCheck(int i, int j) {
        if (i < 1 || i > N || j < 1 || j > M) {
            return false;
        }
        return true;
    }
    public static void printArray2D(int[][] arr) {
        if (arr == null) {
            System.out.println("배열이 비어있습니다.");
            return;
        }

        // 윗줄 테두리
        System.out.println("┌" + "─".repeat(arr[0].length * 4 + 1) + "┐");

        // 배열 내용 출력
        for (int i = 0; i < arr.length; i++) {
            System.out.print("│ ");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%2d ", arr[i][j]);
            }
            System.out.println("│");
        }

        // 아랫줄 테두리
        System.out.println("└" + "─".repeat(arr[0].length * 4 + 1) + "┘");
    }

}
