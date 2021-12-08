package recursions;

// resource : https://leetcode.com/problems/power-of-two/
public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println(powerOfTwo(24));
        System.out.println(powerOfTwo(12));
        System.out.println(powerOfTwo(9));
        System.out.println(powerOfTwo(10));
        System.out.println(powerOfTwo(2));
        System.out.println(powerOfTwo(4));
        System.out.println(powerOfTwo(8));
        System.out.println(powerOfTwo(16));
    }

    public static boolean powerOfTwo(int n) {
        if (n == 1) {
            return true;
        }
        if (n <= 0 || n % 2 == 1)
            return false;
        return powerOfTwo(n / 2);
    }
}
