/*
Given an array of n positive integers, find the GCD of all the array elements.

Input: n = 3, arr = [1, 2, 3]
Output: 1
Explanation: GCD of 1,2,3 is 1.

Constraints:
1 ≤ N, arr[i] ≤ 105

Expected Complexities:
Time Complexity: O(n log n)
Auxiliary Space: O(1)
*/


public class GCDOfArray {
    public int gcd(int n, int arr[]) {

        int gcd_val = arr[0]; // assume the first element as gcd
        for(int i = 0; i < n; i++){ // loop through n elements
            gcd_val = findGCD(gcd_val, arr[i]); // find gcd of previous element and next element
        }
        return gcd_val; // return the gcd value
    }


    // function to calculate gcd
    public int findGCD(int a, int b){
        while(a % b != 0){
            int rem = a%b;
            a  = b;
            b = rem;
        }
        return b;
    }


    public static void main(String[] args) {
        GCDOfArray g = new GCDOfArray();
        int[] arr = {16,15};
        System.out.println(g.gcd(2, arr));

    }
}
