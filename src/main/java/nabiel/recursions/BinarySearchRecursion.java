package nabiel.recursions;

// resource : https://leetcode.com/problems/binary-search/
public class BinarySearchRecursion {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        System.out.println(binarySearchRecursion(arr, 10));
    }

    public static int binarySearchRecursion(int[] arr, int needle) {
        return binarySearchRecursion(arr, needle, 0, arr.length - 1);
    }

    public static int binarySearchRecursion(int[] arr, int needle, int left, int right) {
        if (left > right) {
            return -1;
        }
        int mid = left + (right - left) / 2;
        if (arr[mid] == needle) {
            return mid;
        } else if (needle < arr[mid]) {
            return binarySearchRecursion(arr, needle, left, mid - 1);
        } else {
            return binarySearchRecursion(arr, needle, mid + 1, right);
        }
    }
}
