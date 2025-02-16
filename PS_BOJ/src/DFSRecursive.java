
import java.util.ArrayList;
import java.util.List;

public class DFSRecursive {
    static List<List<Integer>> graph = new ArrayList<>();
    static boolean[] visited;

    public static void main(String[] args) {
        int nodes = 6; // 노드 개수
        visited = new boolean[nodes + 1]; // 방문 배열 초기화 (1번 노드부터 사용)

        // 그래프 초기화
        for (int i = 0; i <= nodes; i++) {
            graph.add(new ArrayList<>());
        }

        // 간선 추가 (양방향 그래프 예시)
        addEdge(1, 2);
        addEdge(1, 3);
        addEdge(2, 4);
        addEdge(2, 5);
        addEdge(3, 6);

        System.out.println("DFS 탐색 순서:");
        dfs(1); // 1번 노드부터 탐색 시작
    }

    // DFS 함수 (재귀)
    public static void dfs(int node) {
        visited[node] = true; // 현재 노드 방문 처리
        System.out.print(node + " "); // 방문한 노드 출력

        // 현재 노드와 연결된 다른 노드를 재귀적으로 방문
        for (int neighbor : graph.get(node)) {
            if (!visited[neighbor]) { // 방문하지 않은 노드만 탐색
                dfs(neighbor);
            }
        }
    }

    // 간선 추가 함수
    public static void addEdge(int u, int v) {
        graph.get(u).add(v);
        graph.get(v).add(u); // 양방향 그래프일 경우
    }
}
