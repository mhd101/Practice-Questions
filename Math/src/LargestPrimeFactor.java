/* 
Given a number n, your task is to find the largest prime factor of n.

Input: n = 5
Output: 5
Explanation: The prime factorization of 5 is just 5. Therefore, the largest prime factor is 5.
Input: n = 24
Output: 3
Explanation: The prime factorization of 24 is 2^3×3. Among the prime factors (2, 3), the largest is 3.
Input: n = 13195
Output: 29
Explanation: The prime factorization of 13195 is 5×7×13×29. The largest prime factor is 29.

Constraints:
2 <= n <= 10^9

Expected Complexities:
Time Complexity: O(sqrt(n))
Auxiliary Space: O(1)
*/

public class LargestPrimeFactor {
    static int largestPrimeFactor(int n) {
        int d = 2; // Start with the smallest prime number as the base divisor

        // Loop until d^2 is less than n, i.e., up to √n
        while (d * d <= n) {

            if (n % d == 0) {
                // If d divides n, it's a factor — divide n by d to reduce it
                n = n / d;
            } else {
                // If not divisible, check the next number
                d++;
            }
        }

        // At this point, n is the largest prime factor
        return n;

    }

    public static void main(String[] args) {
        System.out.println(largestPrimeFactor(24));
    }
}
