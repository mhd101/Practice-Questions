/* 
Given two numbers a and b, find kth digit from right of ab.

Input: a = 5, b = 2, k = 2
Output: 2
Explanation: 52 = 25 and second digit from right is 2.

Constraints:
1 <= a,b <= 15
1 <= k <= digits in ab
*/

public class PrintKthDigit {
    static long kthDigit(int a, int b, int k){
        long digit = 0;
        if( (a >= 1 && a <= 15) && (b >= 1 && b <= 15) ){
            long expRes = (long)Math.pow(a,b); // calculate a^b

            if(k >= 1 && k <= expRes){
                for(int i = 0; i < k; i++){
                    digit = expRes % 10;
                    expRes /= 10;
                }
            }
        } 
        return digit;
    }

    public static void main(String[] args) {
        System.out.println(kthDigit(12,11, 4));
    }
}
