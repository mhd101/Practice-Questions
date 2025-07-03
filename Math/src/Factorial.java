/* Given a positive integer, n. Find the factorial of n.

Input: n = 5
Output: 120
Explanation: 1 x 2 x 3 x 4 x 5 = 120

Constraints:
0 <= n <= 12

Time Complexity: O(n)
Auxiliary Space: O(1)
*/

public class Factorial {
    static int factorial(int n){
        if (n == 0){
            return 1;
        }

        return n * factorial(n-1);
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
