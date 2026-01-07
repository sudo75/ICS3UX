public class Utils {
    public static int pow(int base, int exp) {
        if (exp == 1) return base;
        if (exp == 2) return base * base;

        return base * pow(base, exp - 1);
    }
}
