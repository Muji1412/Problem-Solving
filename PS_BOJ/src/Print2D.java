public class Print2D {

    // int[][] 배열 출력 메서드
    public static void print2DArray(int[][] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty.");
            return;
        }
        int rows = arr.length;
        int cols = arr[0].length;

        // 열 인덱스 헤더 출력
        System.out.print("     ");
        for (int col = 0; col < cols; col++) {
            System.out.printf("%4d", col);
        }
        System.out.println();

        // 구분 선 출력
        System.out.print("----+");
        for (int col = 0; col < cols; col++) {
            System.out.print("----");
        }
        System.out.println();

        // 각 행의 데이터 출력
        for (int row = 0; row < rows; row++) {
            System.out.printf("%3d |", row);
            for (int col = 0; col < cols; col++) {
                System.out.printf("%4d", arr[row][col]);
            }
            System.out.println();
        }
    }

    // char[][] 배열 출력 메서드
    public static void print2DArray(char[][] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty.");
            return;
        }
        int rows = arr.length;
        int cols = arr[0].length;

        // 열 인덱스 헤더 출력
        System.out.print("     ");
        for (int col = 0; col < cols; col++) {
            System.out.printf("%4d", col);
        }
        System.out.println();

        // 구분 선 출력
        System.out.print("----+");
        for (int col = 0; col < cols; col++) {
            System.out.print("----");
        }
        System.out.println();

        // 각 행의 데이터 출력
        for (int row = 0; row < rows; row++) {
            System.out.printf("%3d |", row);
            for (int col = 0; col < cols; col++) {
                System.out.printf("%4c", arr[row][col]);
            }
            System.out.println();
        }
    }

    // 제네릭 배열(T[][]) 출력 메서드 (String[][] 등 참조형 배열 호환)
    public static <T> void print2DArray(T[][] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty.");
            return;
        }
        int rows = arr.length;
        int cols = arr[0].length;

        // 열 인덱스 헤더 출력
        System.out.print("     ");
        for (int col = 0; col < cols; col++) {
            System.out.printf("%4d", col);
        }
        System.out.println();

        // 구분 선 출력
        System.out.print("----+");
        for (int col = 0; col < cols; col++) {
            System.out.print("----");
        }
        System.out.println();

        // 각 행의 데이터 출력
        for (int row = 0; row < rows; row++) {
            System.out.printf("%3d |", row);
            for (int col = 0; col < cols; col++) {
                System.out.printf("%4s", arr[row][col]);
            }
            System.out.println();
        }
    }
}
