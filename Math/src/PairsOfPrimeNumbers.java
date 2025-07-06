/*
Find all pairs (sets) of prime numbers (p,q) such that p*q <= n, where n is the given number.

Input: n = 4
Output: 2 2
Explanation: Pair (2, 2) which has both prime numbers as well as satisfying the condition 2*2 <= 4.

Input: n = 8
Output: 2 2 2 3 3 2
Explanation: Pairs(2, 2), (2, 3) and (3, 2) which has both prime numbers and satisfying the given condition. 

Constraints:
1 <= n <= 400

Expected Complexities:
Time Complexity: O(n2* sqrt(n))
Auxiliary Space: O(1)
*/

import java.util.ArrayList;

public class PairsOfPrimeNumbers{
    public int[] prime_pairs(int n) {
        
        ArrayList<Integer> list = new ArrayList<>();
    
        // loop upto n
        for(int i = 2; i <= n; i++){
            // check i*j <= n
            for(int j = 2; i*j <= n; j++){
                // check i or j is prime or not
                if(isPrime(i) && isPrime(j)){
                    list.add(i);
                    list.add(j);
                }
            }
        }
        
        // convert arraylist to arr
        int[] res = new int[list.size()];
        for(int i = 0; i < res.length; i++){
            res[i] = list.get(i);
        }
        
        return res;
    } 
    
    static boolean isPrime(int n){
        if (n == 1) return false;
        if (n == 2 || n == 3) return true;
        
        if (n%2 == 0 || n%3 == 0) return false;
        
        for(int i = 5; i*i <=n; i++){
            if(n%i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        PairsOfPrimeNumbers x = new PairsOfPrimeNumbers();
        int[] res = x.prime_pairs(8);
        for(int r: res){
            System.out.println(r);
        }
    }
}