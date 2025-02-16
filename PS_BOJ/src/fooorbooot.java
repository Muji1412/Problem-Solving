public class fooorbooot {
    public static void main(String[] args) {

        System.out.println(java(9));
        System.out.println(java(4));

    }

    static String java(int a) {
        String s = " ";
        if ((a & 2) == 0) {
            int loga = a / 2;
            for (int i = 0; i < loga; i++) {
                s += "자바";

            }
        }
        if (a % 2 == 0) {
            int loga = a / 2;
            for (int i = 0; i < loga; i++) {
                s += "자바";

            }
            if (a == 1) {
                s += "자";
            }
            s += "자";
        }
        return s;
    }
}
