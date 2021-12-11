package nabiel.recursions;

import java.util.Arrays;

// problem : https://www.geeksforgeeks.org/sum-triangle-from-array/#
public class SumTriangleFromArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        solve(arr);
    }

    public static void solve(int[] arr) {
        if (arr.length < 1) {
            return;
        }

        // sum concecutive elements in the array
        int[] temp = new int[arr.length - 1];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = arr[i] + arr[i + 1];
        }
        solve(temp);
        System.out.println(Arrays.toString(arr));
    }
}
