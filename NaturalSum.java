package recursions;

// resource : https://www.geeksforgeeks.org/sum-of-natural-numbers-using-recursion/
public class NaturalSum {

    public static void main(String[] args) {
        System.out.println(sum(5));
        System.out.println(sum(4));
        System.out.println(sum(3));
        System.out.println(sum(2));
        System.out.println(sum(1));
    }

    public static int sum(int n) {
        if (n <= 1) {
            return n;
        }
        return n + sum(n - 1);
    }
}
