/*
Given an integer array arr[]. Find the number of triangles that can be formed with three different array elements as lengths of three sides of the triangle. 

A triangle with three given sides is only possible if sum of any two sides is always greater than the third side.

Input: arr[] = [4, 6, 3, 7]
Output: 3
Explanation: There are three triangles possible [3, 4, 6], [4, 6, 7] and [3, 6, 7]. Note that [3, 4, 7] is not a possible triangle.  

Input: arr[] = [10, 21, 22, 100, 101, 200, 300]
Output: 6
Explanation: There can be 6 possible triangles: [10, 21, 22], [21, 100, 101], [22, 100, 101], [10, 100, 101], [100, 101, 200] and [101, 200, 300]

Input: arr[] = [1, 2, 3]
Output: 0
Explanation: No triangles are possible.

Constraints:
1 <= arr.size() <= 103
0 <= arr[i] <= 105

Expected Complexities:
Time Complexity: O(n^2)
Auxiliary Space: O(1)
*/

import java.util.Arrays;

public class CountPossibleTraingles {
    static int countTriangles(int arr[]) {

        // If there are fewer than 3 sides, no triangle can be formed.
        if (arr.length < 3)
            return 0;

        // Sort the array in ascending order
        Arrays.sort(arr);

        int count = 0;

        // Fix the third side (largest side of the triangle)
        for (int k = arr.length - 1; k >= 2; k--) {
            int i = 0; // starting pointer
            int j = k - 1; // end pointer before the largest side

            // Check pairs (i, j) such that arr[i] + arr[j] > arr[k]
            while (i < j) {
                if (arr[i] + arr[j] > arr[k]) {
                    // All pairs between i and j can form a triangle with arr[k]
                    count += (j - i);
                    j--; // Decrease j to check smaller pairs
                } else {
                    i++; // Increase i to increase the sum
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = { 9, 22, 15, 33, 34, 47, 7, 42, 10 };
        System.out.println(countTriangles(arr));
    }
}
