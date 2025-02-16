import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class num1991 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Tree tree = new Tree();

        while (n-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String root = st.nextToken();
            String left = st.nextToken();
            String right = st.nextToken();

            tree.insert(root, left, right);
        }

        preOrder(tree.root);
        System.out.println();
        inOrder(tree.root);
        System.out.println();
        postOrder(tree.root);
        //전위, 중위, 후위 순회 만들기

        // 전위 - 맨 처음꺼 뽑아서 던지기
        // 중위 - 좌 - 중 - 우
        // 후위 - 좌 - 우 - 중


    }
    // 맨 처음 위에 노드 받고 바로 던짐 - 이후 재귀로 좌로 쭉 가서 다 던지고 우 던짐
    public static void preOrder(node node) {
        if (node != null) {
            System.out.print(node.data);
            preOrder(node.left);
            preOrder(node.right);
        }
    }
    // 좌측 싹다 던지고 가운데 던짐

    public static void inOrder(node node) {
        if (node != null) {
            inOrder(node.left);
            System.out.print(node.data);
            inOrder(node.right);
        }
    }
    public static void postOrder(node node) {
        if (node != null) {
            postOrder(node.left);
            postOrder(node.right);
            System.out.print(node.data);
        }
    }
    public static class node{
        String data;
        node left;
        node right;
        node(String data) {
            this.data = data;
        }
    }

    public static class Tree {
        node root;

        public Tree() {
            root = null;
        }

        public void insert(String data, String left, String right) {
            // 맨 처음, 트리에 아무것도 없는 상태
            if (root == null) {
                root = new node(data);

                if (!left.equals(".")) {
                    root.left = new node(left);
                }
                if (!right.equals(".")) {
                    root.right = new node(right);
                }
            } else { // 맨 처음이 아님, 루트에 뭔가 있다는거니까 거기서부터는 search시켜서 하위 트리를 찾고, 거기 아래에 붙혀주면 됨
                search(root, data, left, right);
            }
        }

        public void search(node node,String data, String left, String right) {
            //가 봤는데, 간 노드가 null이면 리턴
            if (node == null) {
                return;
            }
            //가 봤는데, node가 일치하는경우 (해당하는 노드까지 도달했을때)
            if (node.data.equals(data)) {
                if (!left.equals(".")) {
                    node.left = new node(left);
                }
                if (!right.equals(".")) {
                    node.right = new node(right);
                }
            } else { //불일치 케이스는 다시 재귀시켜서 찾을때까지 방문시킴
                    search(node.left,data,left,right);
                    search(node.right,data,left,right);
            }
        }
    }
}


