/*
Given a positive integer n, calculate and return all prime numbers less than or equal to n using the Sieve of Eratosthenes algorithm.
A prime number is a natural number greater than 1 that has no positive divisors other than 1 and itself.

Input: n = 10
Output: [2, 3, 5, 7]
Explanation: Prime numbers less than equal to 10 are 2, 3, 5 and 7.

Input: n = 35
Output: [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31]
Explanation: Prime numbers less than equal to 35 are 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 and 31.

Constraints:
1 ≤ n ≤ 10^4

Expected Complexities
Time Complexity: O(n*log(log(n)))
Auxiliary Space: O(n)
*/

import java.util.ArrayList;
import java.util.Arrays;

public class Sieve {
    static ArrayList<Integer> sieve(int n) {
        int[] prime = new int[n+1];
        // fill all places with 1
        Arrays.fill(prime, 1);

        // create array list to store the result
        ArrayList<Integer> res = new ArrayList<>();

        // run loop from 2 to n 
        for(int i = 2; i <= n; i++){
            // check the index is equal to 1
            if(prime[i] == 1){
                for(int j = i * i; j <= n; j += i){ // mark all its multiple 0
                    prime[j] = 0;
                }
                res.add(i); // add the current index(i) to the result
            }

        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(sieve(30));
    }
}
