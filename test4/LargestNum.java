public class LargestNum {
    public static void main(String[] args) {
        System.out.println(Largest_Int(2, 3, 9));
        System.out.println(Largest_Int(2, 35, -5));
        System.out.println(Largest_Int(-73, 4, 5));
    }
    
    public static int Largest_Int(int int1, int int2, int int3) {
        // Use if statements to abide by the rule to not solely use Math.max

        int max12; // max of int1 and int2

        if (int1 > int2) {
            max12 = int1;
        } else {
            max12 = int2;
        }

        if (max12 > int3) return max12;
        return int3;
    }
}
