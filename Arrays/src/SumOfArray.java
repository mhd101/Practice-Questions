/*
You are given an integer array arr[]. The task is to find the sum of it.

Input: arr[] = [1, 2, 3, 4]
Output: 10
Explanation: 1 + 2 + 3 + 4 = 10.

Input: arr[] = [1, 3, 3]
Output: 7
Explanation: 1 + 3 + 3 = 7.

Constraints:
1 <= arr.size <= 105
1 <= arr[i] <= 104

Expected Complexities:
Time Complexity: O(n)
Auxiliary Space: O(1)
*/

public class SumOfArray {
    int arraySum(int arr[]) {
        int sum = 0;
        for (int x : arr) {
            sum += x;
        }
        return sum;
    }

    public static void main(String[] args) {
        SumOfArray s = new SumOfArray();
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println(s.arraySum(arr));
    }
}
