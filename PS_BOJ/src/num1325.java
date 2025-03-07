import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class num1325 {
    static int n, m;
    static int[] trusts;
    static boolean[] visited;
    static List<List<Integer>> list = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());


        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        trusts = new int[n+1];

        for (int i = 0; i <= n; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            list.get(b).add(a);
        }

        for (int i = 1; i <= n; i++) {
            dfs(i);
        }

        int max = 0;

        for (int value : trusts) {
            max = Math.max(max, value);
        }

        for (int i = 1; i <= n; i++) {
            if (trusts[i] == max) {
                System.out.print(i + " ");
            }
        }

    }
    static int dfs(int a){
        boolean[] visited = new boolean[n + 1];
        Stack<Integer> stack = new Stack<>();

        int hacked = 1;
        stack.push(a);
        visited[a] = true;
        while(!stack.isEmpty()){
            int cur = stack.pop();
            for (int next : list.get(cur)) {
                if(!visited[next]){
                    stack.push(next);
                    visited[next] = true;
                    trusts[next]++;
                    hacked++;
                }
            }
        }

        return hacked;
    }
}
