package recursions;

// resource : https://practice.geeksforgeeks.org/problems/print-1-to-n-without-using-loops-1587115620/1/
public class Loop1ToNRecursion {
    public static void main(String[] args) {
        solve(2);
    }

    public static void solve(int n) {
        if (n == 0) {
            return;
        }
        solve(n - 1);
        System.out.println(n);
    }
}
