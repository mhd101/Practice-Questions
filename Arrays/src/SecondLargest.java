/*
Given an array of positive integers arr[], return the second largest element from the array. If the second largest element doesn't exist then return -1.
Note: The second largest element should not be equal to the largest element.

Input: arr[] = [12, 35, 1, 10, 34, 1]
Output: 34
Explanation: The largest element of the array is 35 and the second largest element is 34.

Input: arr[] = [10, 5, 10]
Output: 5
Explanation: The largest element of the array is 10 and the second largest element is 5.

Input: arr[] = [10, 10, 10]
Output: -1
Explanation: The largest element of the array is 10 and the second largest element does not exist.

Constraints:
2 ≤ arr.size() ≤ 10^5
1 ≤ arr[i] ≤ 10^5

Expected Complexities
Time Complexity: O(n)
Auxiliary Space: O(1)
*/

public class SecondLargest {
    public int getSecondLargest(int[] arr) {
        // using Integer.MIN_VALUE works for both positive and negative
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        if(arr.length < 2){ // array should contain atleast 2 elements
            return -1;
        }

        for(int i =0; i < arr.length; i++){
            if(arr[i] > max){
                secondMax = max;
                max = arr[i];
            } else if( arr[i] > secondMax && arr[i] != max){ // here check for this case 10 5 10 (duplicate elements are also present)
                secondMax = arr[i];
            }
        }

        if(secondMax == Integer.MIN_VALUE){ // no second largest (all element must be same)
            return -1;
        }

        return secondMax;
    }

    public static void main(String[] args) {
        SecondLargest s = new SecondLargest();
        int[] arr = { 10, 6,10 };
        int[] arr2 = { 10, 20, 40, 30, 15 };
        int[] arr3 = { 10, 2, 14 };
        int[] arr4 = { 10, 10 };
        int[] arr5 = { 10, 30 };
        System.out.println(s.getSecondLargest(arr));
        System.out.println(s.getSecondLargest(arr2));
        System.out.println(s.getSecondLargest(arr3));
        System.out.println(s.getSecondLargest(arr4));
        System.out.println(s.getSecondLargest(arr5));
    }
}
