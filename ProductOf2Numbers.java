package recursions;

// resource : https://www.geeksforgeeks.org/product-2-numbers-using-recursion/
public class ProductOf2Numbers {
    public static void main(String[] args) {
        System.out.println(solve(5, 100000));
    }

    public static int solve(int x, int y) {
        if (y == 1) {
            return x;
        }
        if (y > x) {
            return solve(y, x);
        }

        return x + solve(x, y - 1);
    }
}
