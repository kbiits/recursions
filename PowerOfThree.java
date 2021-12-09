package recursions;

// resource : https://leetcode.com/problems/power-of-three/
public class PowerOfThree {
    public static void main(String[] args) {
        System.out.println(solve(6));
        System.out.println(solve(12));
        System.out.println(solve(15));
        System.out.println(solve(18));
        System.out.println(solve(3));
        System.out.println(solve(9));
        System.out.println(solve(27));
        System.out.println(solve(81));
    }

    public static boolean solve(int n) {
        if (n == 1)
            return true;

        if (n % 3 != 0 || n <= 0) {
            return false;
        }

        return solve(n / 3);
    }
}
