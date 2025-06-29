/*
Given three integers a, r, and n, where a is the first term of a geometric progression (GP), r is the common ratio, and n is the position of the term you need to find. Your task is to calculate the n-th term of the GP.
Since the result can be very large, return the answer modulo 1000000007 (i.e. 109+ 7).

Input: a = 2, r = 2, n = 4
Output: 16
Explanation: The GP series is 2, 4, 8, 16, 32,... in which 16 is the 4th term.

Constraints:
1 ≤ a, r, n ≤ 106
*/

import java.math.BigInteger;

public class GP {

    static final BigInteger MOD = BigInteger.valueOf(1000000007);

    public int nthTerm(int a, int r, int n){
        BigInteger base = BigInteger.valueOf(r);
        BigInteger power = base.modPow(BigInteger.valueOf(n-1), MOD); // r^(n-1) % MOD
        BigInteger nTerm = BigInteger.valueOf(a).multiply(power).mod(MOD); // a * power % MOD
        return nTerm.intValue();
    }

    public static void main(String[] args) {
        GP gp = new GP();
        int result = gp.nthTerm(2, 2, 4);
        System.out.println(result);
    }
}
