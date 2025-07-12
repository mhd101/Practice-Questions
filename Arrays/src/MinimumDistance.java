/* 
You are given an array, arr[]. Find the minimum index based distance between two distinct elements of the array, x and y. Return -1, if either x or y does not exist in the array.

Input: arr[] = [1, 2, 3, 2], x = 1, y = 2
Output: 1
Explanation: x = 1 and y = 2. There are two distances between x and y, which are 1 and 3 out of which the least is 1.

Input: arr[] = [86, 39, 90, 67, 84, 66, 62], x = 42, y = 12
Output: -1
Explanation: x = 42 and y = 12. We return -1 as x and y don't exist in the array.

Input: arr[] = [10, 20, 30, 40, 50], x = 10, y = 50
Output: 4
Explanation: The distance between x = 10 (index 0) and y = 50 (index 4) is 4, which is the only distance between them.

Constraints:
1 <= arr.size() <= 10^5
0 <= arr[i], x, y <= 10^5
x != y

Expected Complexities
Time Complexity: O(n)
Auxiliary Space: O(n)
*/

public class MinimumDistance {
    static int  minDist(int arr[], int x, int y){
        
        int ans = -1;
        int xi = -1, yi = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == x){
                xi = i;
                if(yi != -1){
                    if(ans == -1){
                        ans = Math.abs(xi-yi);
                    } else {
                        ans = Math.min(ans, Math.abs(xi-yi));
                    }
                }
            } else if (arr[i] == y){
                yi=i;
                if(xi != -1){
                    if(ans == -1){
                        ans = Math.abs(xi-yi);
                    } else {
                        ans = Math.min(ans, Math.abs(xi-yi));
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,0,3,2,5};
        System.out.println(minDist(arr, 2,3));
    }
}
