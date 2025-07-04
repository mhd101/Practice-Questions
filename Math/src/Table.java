/* 
Create the multiplication table from 1 to 10 for a given number n and return the table as an array.

Input: n = 9
Output: 9 18 27 36 45 54 63 72 81 90

Constraints: 
1 <= N <= 10^6
*/

import java.util.ArrayList;

public class Table {
    static ArrayList<Integer> getTable(int n) {

        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 1; i <= 10; i++) {
            int res = n * i;
            arr.add(res);
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(getTable(5));
    }
}

