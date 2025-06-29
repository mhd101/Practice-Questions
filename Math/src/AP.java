/* 
Given the first 2 terms a1 and a2 of an Arithmetic Series. Find the nth term of the series. 

Input: a1 = 2, a2 = 3, n = 4
Output: 5
Explanation: The series is: 2,3,4,5,6.... Thus, the 4th term is 5.

Constraints:
-104 <= a1 , a2 <= 104
1 <= n <= 104

*/

public class AP {
    public static int nthTermOfAP(int a1, int a2, int n){
        int nth_term = a1 + (n-1)*(a2-a1);
        return nth_term;
    }
    public static void main(String[] args) {
        System.out.println(nthTermOfAP(2, 3, 4));
    }
}
