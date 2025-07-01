/*
Given two integers a and b, the task is to compute their LCM and GCD and return an array containing their LCM and GCD.

Input: a = 14 , b = 8
Output: [56, 2]
Explanation: LCM of 14 and 8 is 56, while their GCD is 2.

Constraints:
1 <= a, b <= 10^9

Expected Complexities:
Time Complexity: O(log(min(a, b))
Auxiliary Space: O(1)
 */

public class LCMandGCD {
    public static int[] lcmAndGcd(int a, int b){
        int result[] = new int[2];

        int x = a;
        int y = b;

        while(x % y != 0){
            int rem = x % y;
            x = y;
            y = rem;
        }

        int gcd = y;

        int lcm = (a * b) / gcd; 

        result[0] = lcm;
        result[1] = gcd;

        return result;
    }

    public static void main(String[] args) {
        System.out.println(lcmAndGcd(10, 15));
    }
}
