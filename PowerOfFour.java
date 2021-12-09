package recursions;

// resource : https://leetcode.com/problems/power-of-four/
public class PowerOfFour {
    public static void main(String[] args) {
        System.out.println(isPowerOfFour(1));
        System.out.println(isPowerOfFour(2));
        System.out.println(isPowerOfFour(10));
        System.out.println(isPowerOfFour(12));
        System.out.println(isPowerOfFour(123871));
        System.out.println(isPowerOfFour(12394853));
        System.out.println(isPowerOfFour(1982738764));
        System.out.println(isPowerOfFour(4));
        System.out.println(isPowerOfFour(16));
        System.out.println(isPowerOfFour(64));
        System.out.println(isPowerOfFour(256));
    }

    public static boolean isPowerOfFour(int n) {
        if (n == 1) {
            return true;
        }

        if (n <= 0 || n % 4 != 0) {
            return false;
        }
        return isPowerOfFour(n / 4);
    }
}
