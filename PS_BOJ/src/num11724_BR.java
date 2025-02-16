import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class num11724_BR {
    static int nodeCount;
    static int ccCount;

    static boolean[] visited;
    static ArrayList<Integer>[] graph;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        graph = new ArrayList[N + 1];
        visited = new boolean[N + 1];

        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 1; i <= M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            addEdge(a, b);
        }

        // 그래프 세팅 완료
//        System.out.println(graph[N].size());

        for (int i = 1; i <= N; i++) {
            if (!visited[i]) {
                dfs(i);
                ccCount++;
            }
            if (nodeCount == N) {
                break;
            }
        }

        System.out.println(ccCount);






    }
    public static void addEdge(int v, int w) {
        graph[v].add(w);
        graph[w].add(v);
    }

    public static void dfs(int v) {
        Stack<Integer> stack = new Stack<>();
        stack.push(v);

        while (!stack.isEmpty()) {
            int popped = stack.pop();
            if (!visited[popped]) {
                visited[popped] = true;
                nodeCount++;
            }

            for (int w : graph[popped]) {
                if (!visited[w]) {
                    stack.push(w);
                }
            }
        }
    }
}
