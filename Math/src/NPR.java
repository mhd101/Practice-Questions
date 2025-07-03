/*Write a program to calculate nPr . nPr  represents n permutation r and value of nPr  is (n!) / (n-r)!.

Input: n = 6, r = 3
Output: 6
Explaination: 6!/(6-3)! = 6!/3! = 720/6 = 120.

Constraints:
1 ≤ n, r ≤ 20

Expected Complexities
Time Complexity: O(n)
Auxiliary Space: O(1)
*/

public class NPR {
    static long nPr(long n, long r){
         if (r == 1) return n; 
        if (r == 0) return 1;


        long res = 1;

        for(long i = 1; i <= r; i++){
            res = res * (n-r+i);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(nPr(6, 6));
    }
}
