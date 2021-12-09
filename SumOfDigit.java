package recursions;

// resource : https://www.geeksforgeeks.org/sum-digit-number-using-recursion/
public class SumOfDigit {
    public static void main(String[] args) {
        System.out.println(sumOfDigit(12345));
    }

    public static int sumOfDigit(int digit) {
        if (digit < 10) {
            return digit;
        }
        return digit % 10 + sumOfDigit(digit / 10);
    }
}
