/*
Given a string b representing a Binary Number, The problem is to find its decimal equivalent.

Input : b = 1010
Output : 10
Explanation : The decimal equivalent of the binary number 1010 is 23 + 21 = 10.

Constraints:
1 <= number of bits in binary number  <= 16

Time Complexity: O(log n)
Auxiliary Space: O(1)
*/

public class BinaryToDecimal {
    public int binaryToDecimal(String b){
        int sum = 0;
        if(b.length() >= 1 && b.length() <= 16){
             long binary = Long.parseLong(b);
             for(int i = 0; i < b.length(); i++){
                long digit = binary % 10;
                long expRes = digit * (long)Math.pow(2, i);
                sum = sum + (int)expRes;
                binary = binary / 10;
             }
        }
        return sum;
    }

    public static void main(String[] args) {
        BinaryToDecimal b = new BinaryToDecimal();
        int result = b.binaryToDecimal("100001");
        System.out.println(result);
    }
}
