import java.util.*;

public class num16928 {

    static boolean[] visited = new boolean[101];
    static HashMap<Integer, Integer> ladderMap = new HashMap<>();
    static HashMap<Integer, Integer> snakeMap = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();


        // 사다리와 뱀의 개수에 따라 맵에 저장
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            ladderMap.put(a, b);
        }
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            snakeMap.put(a, b);
        }

        System.out.println(bfs());

    }


    public static int bfs() {
        // 주사위 굴려서 나오는건 1-6
        // 시작은 1, 도착은 100


        // 큐에 담을 정보는 [현재 위치, 주사위 굴린 횟수]
        // 시작은 항상 1부터 시작하기때문에 [1,0] 으로 시작

        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{1, 0});
        visited[1] = true;
        while (!q.isEmpty()) {
            int[] poll = q.poll();
            int curIndex = poll[0];
            int curDice = poll[1];


            // 100에 도달한 경우에는 현재 주사위 횟수 리턴

            if (curIndex == 100) {
                return curDice;
            }

            // 다음 숫자 = 1부터 6까지 더해준 값
            // + 1,2,3,4,5,6
            for (int i = 1; i <= 6; i++) {
                int nextIndex = curIndex + i;

                // 100 이하의 케이스만 보면 되고, 이미 방문한곳은 제외
                if (nextIndex <= 100 && !visited[nextIndex]) {
                    visited[nextIndex] = true;

                    // 만약 사다리나 뱀에 해당하는 숫자가 있는 경우에는
                    // [map에서 get한 값, 주사위 횟수+1] 삽입
                    // 해당 없을시
                    // [다음 숫자, 주사위 횟수+1] 삽입
                    if (ladderMap.containsKey(nextIndex)) {
                        q.offer((new int[]{ladderMap.get(nextIndex), curDice + 1}));
                    } else if (snakeMap.containsKey(nextIndex)) {
                        q.offer(new int[]{snakeMap.get(nextIndex), curDice + 1});
                    } else {
                        q.offer(new int[]{nextIndex, curDice + 1});
                    }
                }
            }
        }
        return -1;
    }
}
