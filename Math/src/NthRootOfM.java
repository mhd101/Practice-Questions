/*
You are given 2 numbers n and m, the task is to find n√m (nth root of m). If the root is not integer then returns -1.

Input: n = 2, m = 9
Output: 3
Explanation: 32 = 9

Input: n = 3, m = 9
Output: -1
Explanation: 3rd root of 9 is not integer.

Input: n = 1, m = 14
Output: 14

Constraints:
1 <= n <= 30
1 <= m <= 10^9

Expected Complexities:
Time Complexity: O(n log m)
Auxiliary Space: O(1)
*/

public class NthRootOfM {
    public int nthRoot(int n, int m){
        if (n == 1) return m;

        int low = 1, high = m;

        while(low <= high){
            int mid = (low+high)/2;
            int pow = power(mid, n, m); // need to handle edge case of mid^n (overflow)
            if(pow == m){ 
                return mid;
            } else if(pow > m){
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }

    public int power(int mid, int n, int m){
        long result = 1;
        for(int i = 1; i <= n; i++){
            result *= mid;
            if (result > m) return mid; // handling overflow
        }
        return (int)result;
    }

    public static void main(String[] args) {
        NthRootOfM o = new NthRootOfM();
        System.out.println(o.nthRoot(2,9));

    }
}
