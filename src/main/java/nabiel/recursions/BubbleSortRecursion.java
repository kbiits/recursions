package nabiel.recursions;

import java.util.Arrays;

// resource : https://www.geeksforgeeks.org/recursive-bubble-sort/
public class BubbleSortRecursion {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        sort(arr, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr, int endIdx) {
        if (endIdx < 1) {
            return;
        }
        for (int i = 0; i < endIdx; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        sort(arr, endIdx - 1);
    }

}
