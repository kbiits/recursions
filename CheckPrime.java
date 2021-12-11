package nabiel.recursions;

// resource : https://www.geeksforgeeks.org/recursive-program-prime-number/
public class CheckPrime {
    public static void main(String[] args) {
        System.out.println(isPrime(11, 2));
    }

    public static boolean isPrime(int n, int i) {
        if (n < 2) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }
        if (n % i == 0) {
            return false;
        }
        if (i * i > n) { // if i greater than the largest factor of n
            return true;
        }
        return isPrime(n, i + 1);
    }
}
