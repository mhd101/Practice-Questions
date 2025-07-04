/* 
Given two positive integers a and b, find GCD of a and b.

Note: Don't use the inbuilt gcd function

Examples:

Input: a = 20, b = 28
Output: 4
Explanation: GCD of 20 and 28 is 4

Constraints:
1 ≤ a, b ≤ 10^9

Expected Complexities:
Time Complexity: O(log(min(a, b)))
Auxiliary Space: O(1)
*/

public class GCD {
    public static int gcd(int a, int b) {
        // Euclidean Algorithm
        while (a % b != 0) {
            // a is dividend & b is divisor
            int rem = a % b;
            a = b; // divisor becomes dividend
            b = rem; // remainder becomes divisor
        }

        return b; // last divisor is the gcd

    }

    public static void main(String[] args) {
        System.out.println(gcd(60, 36));
    }
}
