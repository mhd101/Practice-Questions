/*
You are given an array arr[], the task is to return a list elements of arr in alternate order (starting from index 0).

Input: arr[] = [1, 2, 3, 4]
Output: 1 3
Explanation:
Take first element: 1
Skip second element: 2
Take third element: 3
Skip fourth element: 4
Input: arr[] = [1, 2, 3, 4, 5]

Output: 1 3 5
Explanation:
Take first element: 1
Skip second element: 2
Take third element: 3
Skip fourth element: 4
Take fifth element: 5

Constraints:
1 <=  arr.size <= 10^5
1 <= arr[i] <= 10^5

Expected Complexities:
Time Complexity: O(n)
Auxiliary Space: O(1)
*/

import java.util.ArrayList;

public class AlternatesElementInArray {
    public ArrayList<Integer> getAlternates(int arr[]) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++){
            if (i % 2 == 0){
                list.add(arr[i]);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        AlternatesElementInArray x = new AlternatesElementInArray();
        int[] arr = {1,2,3,4,5};
        System.out.println(x.getAlternates(arr));
    }
}
