/*
Given a positive number n. Find the sum of all the digits of n.

Input: n = 687
Output: 21
Explanation: Sum of 687's digits: 6 + 8 + 7 = 21

Input: n = 12
Output 3
Explanation: Sum of 12's digits: 1 + 2 = 3

Constraints:
1 <= n <= 10^5

Expected Complexities
Time Complexity: O(log n)
Auxiliary Space: O(1)
*/

public class SumOfDigits {
    static int sumOfDigits(int n){
        int sum = 0;
        while(n > 0){
            int lastDigit = n % 10;
            sum = sum + lastDigit;
            n = n / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOfDigits(12345));
    }
}
