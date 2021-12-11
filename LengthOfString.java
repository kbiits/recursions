package nabiel.recursions;

// resource : https://www.geeksforgeeks.org/program-for-length-of-a-string-using-recursion/
public class LengthOfString {
    public static void main(String[] args) {
        System.out.println(solve("ab"));
    }

    public static int solve(String str) {
        if (str.isEmpty()) {
            return 0;
        }
        return 1 + solve(str.substring(1));
    }

    public static int solve2(String str, int len) {
        if (str.isEmpty()) {
            return len;
        }
        return solve2(str.substring(1), len + 1);
    }
}
