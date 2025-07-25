/*
Given an array of integers arr[], find the contiguous subarray with the maximum sum that contains only non-negative numbers. If multiple subarrays have the same sum, return the one with the smallest starting index. If the array contains only negative numbers, return -1.

Note: A subarray is a contiguous non-empty sequence of elements within an array.

Examples:

Input: arr[] = [1, 2, 3]
Output: [1, 2, 3]
Explanation: In the given array, every element is non-negative, so the entire array [1, 2, 3] is the valid subarray with the maximum sum.

Input: arr[] = [-1, 2]
Output: [2]
Explanation: The only valid non-negative subarray is [2], so the output is [2].

Input: arr[] = [1, 2, 5, -7, 2, 6]
Output: [1, 2, 5]
Explanation: The valid non-negative subarrays are [1, 2, 5] and [2, 6]. Both have the same sum of 8, but [1, 2, 5] starts earlier, so it is the preferred subarray.

Constraints:
1 ≤ arr.size() ≤ 10^6
-105 ≤ arr[i] ≤ 10^5

Expected Complexities
Time Complexity: O(n)
Auxiliary Space: O(1)

*/

import java.util.ArrayList;

public class MaximumSubArray {
    public ArrayList<Integer> findSubarray(int arr[]) {

        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0; // start pointer
        int j = 0; // end pointer
        int sum = 0; // store current sum
        int maxSum = 0; // store maximum sum
        int startIdx = 0; // store previous sum start pointer
        int lastIdx = -1; // store previous sum end pointer

        // loop through n
        while (j < arr.length){
            // loop if no. is postive
            if(arr[j] >= 0){
                sum += arr[j]; // add it to current sum
                j++; // move the end pointer
            // this block will run when negative no. is encountered    
            } else {
                // check sum with max sum
                if(sum > maxSum){
                    // assign to maxSum
                    maxSum = sum;
                    startIdx = i; // store the previous sum starting index 
                    lastIdx = j-1; // store the previous sum ending index
                }
                sum = 0; // reset the sum
                j++; // move the end pointer from the negative number
                i=j; // same for start pointer
            }
        }

        // This handles the edge case when at the end the array element value is not negative
        if(sum > maxSum){
            maxSum = sum;
            startIdx = i;
            lastIdx = j-1;
        }

        // loop through startIdx and lastIdx and store it in arraylist
        for(int k = startIdx; k <= lastIdx; k++){
            ans.add(arr[k]);
        }

        // if the arraylist is empty means element present inside are negative numbers or the array passed is already empty
        if(ans.isEmpty()){
            ans.add(-1);
        }

        // return the answer
        return ans;
    }

    public static void main(String[] args) {
        MaximumSubArray m = new MaximumSubArray();
        int arr[] = {1,2,3,-2,3,3,-2};
        System.out.println(m.findSubarray(arr));
    }
}
