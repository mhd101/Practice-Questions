/* 
Given a positive number, n. Find the largest Jumping Number with equal number of digits that is smaller than or equal to x. 
Jumping Number: A number is called a Jumping Number if all adjacent digits in it differ by only 1. All single-digit numbers are considered as Jumping Numbers.
For example, 7, 898, 7 and 4343456 are Jumping numbers but 796, 677, and 89098 are not.

Input: n = 50
Output: 45
Explanation: 45 is the largest Jumping Number possible for X = 50.

Constraints:
1 <= n <= 109

Expected Complexities:
Time Complexity: O(n)
Auxiliary Space: O(n)
*/


public class JumpingNumbers {
    static long jumpingNums(long n){
        long num = 0;
        for(long i = 0; i < n; i++){
            long x = i;
            long prevDigit = x % 10;
            x = x / 10;
            // run over each number after taking one digit
            while(x != 0){
                long currDigit = x % 10; // next
                if(Math.abs(prevDigit-currDigit) != 1){ // if prev-curr != 1 , not a jumping number
                    break; 
                }
                prevDigit = currDigit;
                x = x / 10;
            }

            if(x == 0){
                num = i;
            }
        }
        return num; // return largest jumping number for n
    }

    public static void main(String[] args) {
        System.out.println(jumpingNums(20));
    }
}
