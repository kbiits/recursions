package recursions;

import java.util.Scanner;

public class GeekOnacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            System.out.println(solve(in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt()));
        }
        in.close();
    }

    public static int solve(int a, int b, int c, int n) {
        if (n == 1) {
            return a;
        }
        if (n == 2) {
            return b;
        }
        if (n == 3) {
            return c;
        }
        return solve(a, b, c, n - 1) + solve(a, b, c, n - 2) + solve(a, b, c, n - 3);
    }
}
