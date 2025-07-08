/*
You are given an array of integers arr[]. Your task is to reverse the given array.

Note: Modify the array in place.

Input: arr = [1, 4, 3, 2, 6, 5]
Output: [5, 6, 2, 3, 4, 1]
Explanation: The elements of the array are 1 4 3 2 6 5. After reversing the array, the first element goes to the last position, the second element goes to the second last position and so on. Hence, the answer is 5 6 2 3 4 1.

Input: arr = [4, 5, 2]
Output: [2, 5, 4]
Explanation: The elements of the array are 4 5 2. The reversed array will be 2 5 4.

Input: arr = [1]
Output: [1]
Explanation: The array has only single element, hence the reversed array is same as the original.

Constraints:
1<=arr.size()<=10^5
0<=arr[i]<=10^5
*/

public class ReverseArray {
    public void reverseArray(int arr[]) {
        int i = 0;
        int j = arr.length-1;
        
        while(i <= j){
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
            
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        ReverseArray r = new ReverseArray();
        int[] arr = {1,2,3,4,5};
        r.reverseArray(arr);
        for(int x : arr){
            System.out.println(x);
        }
    }
}
