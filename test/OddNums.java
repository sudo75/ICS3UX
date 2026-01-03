public class OddNums {
    public static void main(String[] args) {
        for (int i = -100; i <= 100; i++) {
            if (Math.abs(i) % 2 == 1) {
                System.out.println(i);
            }
        }
    }
}
