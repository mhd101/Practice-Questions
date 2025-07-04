/*
Given a positive integer n, count all pairs of ‘a’(>=1) and ‘b’(>=0) that satisfy the condition a3 + b3 = n.

Input: n = 9 
Output: 2
Explanation: There are two solutions: (a=1, b=2) and (a=2, b=1).

Input: n = 27
Output: 1
Explanation: Thereis only one solution: (a=3, b=0). 

Constraints:
1 <= n <= 10^5

Expected Complexities
Time Complexity: O(cbrt(N))
Auxiliary Space: O(1)
*/

public class PairCubeCount {
    static int pairCubeCount(int n){
        int count = 0;
        for(int i = 1; i*i*i <= n; i++){
            for(int j = 0; j*j*j <= n; j++){
                if((Math.pow(i,3) + Math.pow(j,3)) == n){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(pairCubeCount(9));
    }
}
