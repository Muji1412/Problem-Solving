import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.StringTokenizer;

public class num10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));

        // 상근이 카드 덱 만들기
        int n = Integer.parseInt(br.readLine());
        int[] cards = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            cards[i] = Integer.parseInt(st.nextToken());
        }

        // 대조용 해시맵 생성
        // 해시맵 만들때 시작부터 그냥 카운터 만들어서 해시맵에 넣을려고했는데
        // 지금같이 시간복잡도가 O(n+m) 이 아니라 O(n*m) 이 됨
        HashMap<Integer, Integer> map = new HashMap<>();
        int m = Integer.parseInt(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int[] cards2 = new int[m];
        for (int i = 0; i < m; i++) {
            String a = st2.nextToken();
            cards2[i] = Integer.parseInt(a);
            map.put(Integer.parseInt(a), 0);
        }

        for (int i = 0; i < n; i++) {
            if (map.containsKey(cards[i])) {
                int count = map.get((cards[i]));
                    count++;
                    map.put(cards[i], count);
            }
        }


        StringBuilder sb = new StringBuilder();

        for (int value : cards2) {
            sb.append(map.get(value)).append(" ");
        }

        System.out.println(sb);



    }
}
