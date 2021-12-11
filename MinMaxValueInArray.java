package nabiel.recursions;

// resource : https://www.geeksforgeeks.org/recursive-programs-to-find-minimum-and-maximum-elements-of-array/
public class MinMaxValueInArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        solve(arr);
    }

    public static void solve(int[] arr) {
        solve(arr, 0, 0, 0);
    }

    public static void solve(int[] arr, int idx, int minIdx, int maxIdx) {
        if (idx == arr.length) {
            System.out.println("Min Value : " + arr[minIdx]);
            System.out.println("Max Value : " + arr[maxIdx]);
            return;
        }

        int currMinIdx = arr[idx] < arr[minIdx] ? idx : minIdx;
        int currMaxIdx = arr[idx] > arr[maxIdx] ? idx : maxIdx;
        solve(arr, idx + 1, currMinIdx, currMaxIdx);
    }

    public static int findMinRec(int[] arr, int size) {
        if (size == 1) {
            return arr[0];
        }

        return Math.min(arr[size - 1], findMinRec(arr, size - 1));
    }

    public static int findMaxRec(int[] arr, int size) {
        if (size == 1) {
            return arr[0];
        }

        return Math.max(arr[size - 1], findMinRec(arr, size - 1));
    }
}
