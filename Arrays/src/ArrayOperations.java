/*
Given an array arr, complete the following three functions:
searchEle: This function searches for an element x in the array arr. It should return a boolean value - true if the element is found, and false otherwise.
insertEle: This function inserts an element y at index yi in the array. true will be printed if the insertion is done correctly, and false otherwise.
deleteEle: This function deletes the first occurrence of an element z in the array. true will be printed if the deletion is done correctly, and false otherwise.

 Note: 0-based indexing is followed.

 Input: arr[] = [2, 4, 1, 0, 2], x=1, y=2, yi=2, z=0
Ouput: true true true
Explanation: As x=1 is present in the array, so return 1. After inserting y=2 at yi=2th index, the array becomes 2,4,2,1,0,2. After deleting z=0, the array becomes 2,4,2,1,2
Input: arr[] = [17, 15, 8, 9, 12], x=10, y=6, yi=2, z=5
Ouput: false true true
Explanation: As x=10 is not present in the array, so return 0. After inserting y=6 at yi=2th index, the array becomes 17,15,6,8,9,12. As z=5 not present, the arrays stays as 17,15,6,8,9,12.

Expected Time Complexity: O(n)
Expected Auxiliary Space: O(1)

Constraints:
1 <= arr.size() <= 1500
1 <= x, y, z<= 10^3
0 <= yi< arr.size()
0 <= arri <= 10^5
*/

import java.util.ArrayList;
import java.util.List;

public class ArrayOperations {
    public boolean searchEle(List<Integer> arr, int x) {
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                return true;
            }
        }
        return false;
    }

    public boolean insertEle(List<Integer> arr, int y, int yi) {
        arr.add(y); // increasing the list size
        for (int i = arr.size() - 2; i >= yi; i--) {
            arr.set(i + 1, arr.get(i));
        }
        arr.set(yi, y);

        boolean flag = false;

        for (int i = 0; i < arr.size(); i++) {
            if (i == yi && arr.get(i) == y) {
                flag = true;
            }
        }
        
        return flag;

    }

    public boolean deleteEle(List<Integer> arr, int z) {
        int index = -1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).equals(z)) {
                index = i;
                break;
            }
        }

        if (index == -1) return false;

        for (int i = index; i < arr.size() - 1; i++) {
            arr.set(i, arr.get(i + 1));
        }

        arr.remove(arr.size() - 1);

        boolean flag = true;

        for (int x : arr) {
            if (x == z) {
                flag = false;
            }
        }

        return flag;
    }

    public static void main(String[] args) {
        ArrayOperations o = new ArrayOperations();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(17);
        list.add(15);
        list.add(8);
        list.add(9);
        list.add(12);
        System.out.println(o.searchEle(list, 10));
        System.out.println(o.insertEle(list, 6, 2));
        System.out.println(o.deleteEle(list, 5));
    }
}
