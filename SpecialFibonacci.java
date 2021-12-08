package recursions;

import java.util.Scanner;

// resource : https://www.codechef.com/problems/FIBXOR01/
public class SpecialFibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            System.out.println(solve(in.nextInt(), in.nextInt(), in.nextInt()));
        }
        in.close();
    }

    public static int solve(int a, int b, int n) {
        if (n == 0) {
            return a;
        }
        if (n == 1) {
            return b;
        }
        if (n == 2) {
            return a ^ b;
        }
        return solve(a, b, n % 3);
    }
    // Explanation : 
    // f(0) = a 
    // f(1) = b
    // f(2) = f(1) ^ f(0) = a ^ b
    // f(3) = f(2) ^ f(1) = (a ^ b) ^ b                                                 => a, mean if n % 3 == 0, result is a
    // f(4) = f(3) ^ f(2) = (a ^ b ^ b) ^ (a ^ b)                                       => b, mean if n % 3 == 1, result is b
    // f(5) = f(4) ^ f(3) = (a ^ b ^ b ^ a ^ b) ^ (a ^ b ^ b) = a ^ b                   => a ^ b, mean if n % 3 == 2, result is a ^ b
    // f(6) = f(5) ^ f(4) = (a ^ b) ^ b                                                 => a, mean if n % 3 == 0, result is a

}
