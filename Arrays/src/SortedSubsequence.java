/*
You are given an array arr, you need to find any three elements in it such that arr[i] < arr[j] < arr[k] and i < j < k.

Note:
The output will be 1 if the subsequence returned by the function is present in the array arr
If the subsequence is not present in the array then return an empty array, the driver code will print 0.
If the subsequence returned by the function is not in the format as mentioned then the output will be -1.


Input: arr = [1, 2, 1, 1, 3]
Output: 1
Explanation: A subsequence 1 2 3 exist.

Input: arr = [1, 1, 3]
Output: 0
Explanation: No such Subsequence exist, so empty array is returned (the driver code automatically prints 0 in this case).

Expected Time Complexity: O(n)
Expected Auxiliary Space: O(n)

Constraints:
1 <= arr.size() <= 105
1 <= arr[i] <= 106
*/

import java.util.ArrayList;
import java.util.List;

public class SortedSubsequence {
    public List<Integer> find3Numbers(int[] arr){

        int n = arr.length; 
        ArrayList<Integer> ans = new ArrayList<>();
        int[] leftMin = new int[n]; // left arr to store minimum
        int[] rightMax = new int[n]; // right arr to store maximum 
        leftMin[0] = arr[0]; // let first element is smallest
        for(int i = 1; i < n; i++){ // loop through n
            leftMin[i] = Math.min(arr[i], leftMin[i-1]); // check other smaller value
        }
        rightMax[n-1] = arr[n-1]; // let last element is largest
        for(int i = n-2; i >= 0; i--){ // loop from right to left
            rightMax[i] = Math.max(arr[i], rightMax[i+1]); // check other larger value
        }

        for(int i = 1; i <= n-2; i++){ // loop through n-2 
            if(leftMin[i-1] < arr[i] && arr[i] < rightMax[i+1]){ // check i-1 < i < i+1
                ans.add(leftMin[i-1]); // store i-1
                ans.add(arr[i]); // store i
                ans.add(rightMax[i+1]); // store i+1
                break; // break the loop as subsequence is found
            }
        }

        return ans; 
    }

    public static void main(String[] args) {
        SortedSubsequence s = new SortedSubsequence();
        int[] arr = {1,2,3,3};
        System.out.println(s.find3Numbers(arr));
    }
}
