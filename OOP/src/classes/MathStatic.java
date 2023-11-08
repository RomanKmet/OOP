package classes;

public class MathStatic {
    public static double cashback = 3;
    public static double sale;
    static {
        sale = 30;
    }
    public static double buyProduct(double a) {
        return (a - sale) + cashback;
    }
}
