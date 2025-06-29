/* 
Given two integers n and m (m != 0). The problem is to find the number closest to n and divisible by m. If there is more than one such number, then output the one having the maximum absolute value.

Input: n = 13, m = 4
Output: 12
Explanation: 12 is the Closest Number to 13 which is divisible by 4.

Input: n = -15, m = 6
Output: -18
Explanation: Both -12 and -18 are closest to -15 and divisible by 6, but -18 has the maximum absolute value. So, output is -18.

Constraints:
-105 ≤ n, m ≤ 105

Expected Complexities
Time Complexity: O(1)
Auxiliary Space: O(1)

Tag: Microsoft
*/

public class ClosestNumber {
    static int ClosestNum(int n, int m){
        int quotient = (n / m);

        int n1 = m * quotient;
        int n2 = m > 0 ? m * (quotient + 1) : m * (quotient - 1);

        int diff1 = Math.abs(n-n1);
        int diff2 = Math.abs(n-n2);

        if(diff1 < diff2){
            return n1;
        } else if(diff2 < diff1){
            return n2;
        } else {
            return (Math.abs(n1) > Math.abs(n2)) ? n1 : n2;
        }

    }

    public static void main(String[] args) {
        System.out.println(ClosestNum(15,-6));
    }
}
