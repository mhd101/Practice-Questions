/*
You are given an integer n. Your task is to reverse the digits, ensuring that the reversed number has no leading zeroes.

Input: n = 122
Output: 221
Explanation: By reversing the digits of number, number will change into 221.

Input : n = 200
Output: 2
Explanation: By reversing the digits of number, number will change into 2.

Constraints:
1 <= n <= 10^6

Expected Complexities:
Time Complexity: O(log n)
Auxiliary Space: O(1)
*/

public class ReverseDigits {
    public int reverseDigits(int n) {
        int rev = 0;
        int digit = 0;
        while(n > 0){
            digit = n % 10; // get last digit
            rev = rev*10 + digit; // store the last digit
            n /= 10; //remove the last digit from original n 
        }
        return rev;
    }

    public static void main(String[] args) {
        ReverseDigits r = new ReverseDigits();
        int result = r.reverseDigits(123);
        int result2 = r.reverseDigits(102);
        int result3 = r.reverseDigits(120);
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
    }
}
