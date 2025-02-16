import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class num11286_withLambda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> {
            if (Math.abs(o1) == Math.abs(o2)) {
                return o1 - o2;
            }
            return Math.abs(o1) - Math.abs(o2);
        });


        while (n-- > 0) {
            int a = sc.nextInt();
            if (a == 0) {
                if (pq.isEmpty()) {
                    System.out.println("0");
                } else {
                    System.out.println(pq.poll());
                }
            } else {
                pq.add(a);
            }
        }
    }
}
