/*
Given a sorted array arr. Return the size of the modified array which contains only distinct elements.
Note:
1. Don't use set or HashMap to solve the problem.
2. You must return the modified array size only where distinct elements are present and modify the original array such that all the distinct elements come at the beginning of the original array.

Input: arr = [2, 2, 2, 2, 2]
Output: [2]
Explanation: After removing all the duplicates only one instance of 2 will remain i.e. [2] so modified array will contains 2 at first position and you should return 1 after modifying the array, the driver code will print the modified array elements.

Input: arr = [1, 2, 4]
Output: [1, 2, 4]
Explation:  As the array does not contain any duplicates so you should return 3.

Constraints:
1 ≤ arr.size() ≤ 10^5
1 ≤ ai ≤ 10^6

Expected Complexities:
Time Complexity: O(n)
Auxiliary Space: O(1)
*/

public class RemoveDuplicates {

    public int removeDuplicates(int[] arr){
        int i = 0; // initial pointer
        for (int j = 1; j < arr.length; j++){
            // find next element which is not equal
            if( arr[j] != arr[i]){ 
                // place the value in next which is not equal 
                arr[i+1] = arr[j];
                i++; // move the pointer 
            }
        }

        return (i+1); // count of unique elements
    }

    public static void main(String[] args) {
        RemoveDuplicates r = new RemoveDuplicates();
        int[] arr = {1,2,2,3};
        System.out.println(r.removeDuplicates(arr));
        
    }
}
