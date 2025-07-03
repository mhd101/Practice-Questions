/*
Given a number n, check if the number is perfect or not. A number is said to be perfect if sum of all its factors excluding the number itself is equal to the number.

Input: n = 6
Output: true 
Explanation: Factors of 6 are 1, 2, 3 and 6. Excluding 6 their sum is 6 which is equal to n itself. So, it's a Perfect Number.
Input: n = 10
Output: false
Explanation: Factors of 10 are 1, 2, 5 and 10. Excluding 10 their sum is 8 which is not equal to n itself. So, it's not a Perfect Number.

Constraints:
1 ≤ n ≤ 109

Expected Complexities:
Time Complexity: O(sqrt(n))
Auxiliary Space: O(1)
*/

public class PerfectNumber {
    static boolean isPerfect(int n) {
        if (n <= 1)
            return false;

        int sum = 1; // sum will always be 1 as it is always factor of n
        for (int i = 2; i * i <= n; i++) { // loop until root n
            if (n % i == 0) { // if div by i then add to sum
                sum += i;

                // eg: factor of 10 is 2 using above loop. To find other factor we can divide
                // the n with the 2 to get other corresponding factor.
                int correspondingFactor = n / i;
                if (i != correspondingFactor) { // if i != correspondingfactor add to sum
                    sum += correspondingFactor;
                }
            }

        }

        return sum == n; // check sum is equal to n or not
    }

    public static void main(String[] args) {
        System.out.println(isPerfect(8128));
        ;
    }
}
