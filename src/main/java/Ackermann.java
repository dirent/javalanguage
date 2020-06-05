public class Ackermann {

    public static int ackermann(int m, int n) {
        if (m == 0) {
            return n + 1;
        }
        if (n == 0) {
            return ackermann(m - 1, 1);
        }
        return ackermann(m - 1, ackermann(m, n - 1));
    }

    public static void main(String[] args) {
        for (int m = 0; m <= 3; m++) {
            for (int n = 0; n <= 6; n++) {
                System.out.print(ackermann(m, n) + " ");
            }
            System.out.println();
        }
    }
}
