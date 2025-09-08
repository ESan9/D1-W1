public class Es3 {
    public static double perimeter(double l1, double l2) {
        return (l1 + l2) * 2;
    }

    public static int pari(int int1) {
        if (int1 % 2 == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        double l1 = 1;
        double l2 = 2;
        double result = perimeter(l1, l2);
        System.out.println(result);
        int num = 4;
        System.out.println(pari(num));

    }
}
