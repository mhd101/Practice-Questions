/*Given two integer values n and r, the task is to find the value of Binomial Coefficient nCr

Note: If r is greater than n, return 0.
It is guaranteed that the value of nCr will fit within a 32-bit integer.

Input: n = 5, r = 2
Output: 10
Explaination: The value of 5C2 is calculated as 5!/(5−2)!*2! = 5!/3!*2! = 10.

Input: n = 2, r = 4
Output: 0
Explaination: Since r is greater than n, thus 2C4 = 0

Input: n = 5, r = 0
Output: 1
Explaination: The value of 5C0 is calculated as 5!/(5−0)!*0! = 5!/5!*0! = 1.

Constraints:
1 ≤ n ≤ 100
0 ≤ r ≤ 100

Expected Complexities:
Time Complexity: O(n)
Auxiliary Space: O(1)
*/

public class NCR {

    public int nCr(int n, int r) {
        if (r > n)
            return 0;
        if (r == 0 || r == n)
            return 1;
        if ((n - r) == 1)
            return n;

        long res = 1; 
        for(int i = 1; i <= r; i++){
            res = res * (n-r+i)/i;   
        }

        return (int)res;
    }

    public static void main(String[] args) {
        NCR r = new NCR();
        System.out.println(r.nCr(24, 20));
    }
}
