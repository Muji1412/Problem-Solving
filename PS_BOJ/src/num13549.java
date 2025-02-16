
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class num13549 {
    static int n, dest;
    static int[] dist;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        dest = sc.nextInt();

        dist = new int[100001];

        // 순간이동은 2배로 이동, 0초 사용
        // -1, +1 하는 경우에는 1초 사용

        Arrays.fill(dist, Integer.MAX_VALUE);

        System.out.println(dijk(n));


    }

    public static int dijk(int start) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        pq.offer(new int[]{start, 0});
        dist[start] = 0;

        while (!pq.isEmpty()) {
            int[] cur = pq.poll();
            int curIdx = cur[0];
            int curTime = cur[1];
            if (dist[curIdx] < curTime) { // 볼필요없는 루트인 경우
                continue;
            }

            if (curIdx == dest) { // 일치할시 리턴
                return curTime;
            }


            int nextTime = curTime + 1;
            int plusIdx = curIdx + 1;
            int minusIdx = curIdx - 1;
            int doubleIdx = curIdx * 2;

            if (doubleIdx <= 100000 && curTime < dist[doubleIdx]) {
                dist[doubleIdx] = curTime;
                pq.offer(new int[]{doubleIdx, curTime});
            }
            if (plusIdx <= 100000 && nextTime < dist[plusIdx]) {
                dist[plusIdx] = nextTime;
                pq.offer(new int[]{plusIdx, nextTime});
            }
            if (minusIdx >= 0 && nextTime < dist[minusIdx]) {
                dist[minusIdx] = nextTime;
                pq.offer(new int[]{minusIdx, nextTime});
            }

        }
        return -1;

    }
}
