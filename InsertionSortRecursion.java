package recursions;

import java.util.Arrays;

// resource : https://www.geeksforgeeks.org/recursive-insertion-sort/
public class InsertionSortRecursion {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 1, 5, 3, 9, 6, 4, 2, 1 };
        sort(arr, 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr, int currIdx) {
        if (currIdx == arr.length) {
            return;
        }

        int curVal = arr[currIdx];
        int tempIdx = currIdx - 1;
        while (tempIdx >= 0 && curVal < arr[tempIdx]) {
            arr[tempIdx + 1] = arr[tempIdx];
            tempIdx--;
        }
        arr[tempIdx + 1] = curVal;
        sort(arr, currIdx + 1);
    }
}
