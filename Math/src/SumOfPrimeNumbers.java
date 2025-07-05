/*
Given a positive integer n, compute and return the sum of all prime numbers between 1 and n (inclusive).

A prime number is a natural number greater than 1 that has no positive divisors other than 1 and itself.  

Input: n = 5
Output: 10
Explanation: 2, 3 and 5 are prime numbers between 1 and 5(inclusive), and their sum is 2 + 3 + 5 = 10.

Input: n = 10
Output: 17
Explanation: 2, 3, 5 and 7 are prime numbers between 1 and 10(inclusive), and their sum is 2 + 3 + 5 + 7 = 17.

Constraints:
1 <= n <= 10^5

Expected Complexities:
Time Complexity: O(nloglogn)
Auxiliary Space: O(n)
*/

import java.util.Arrays;

public class SumOfPrimeNumbers {
    public int prime_Sum(int n) {
        
        long sum = 0;
        long[] primes = new long[n+1];

        Arrays.fill(primes, 1);

        for(long i = 2; i <= n; i++){
            if(primes[(int) i] == 1){
                for(long j = i*i; j <= n; j += i){
                    primes[(int) j] = 0;
                }
                sum = sum + i;
            }
        }
        return (int)sum;
    }

    public static void main(String[] args) {
        SumOfPrimeNumbers s = new SumOfPrimeNumbers();
        System.out.println(s.prime_Sum(123332));
    }
}
