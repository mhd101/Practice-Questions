/*
Given a 2D integer array mat[][] and a number x, find whether element x is present in the matrix or not.

Input: mat[][] = [[6, 23, 21],[4, 45, 32],[69, 11, 87]], x = 32
Output: true
Explanation: 32 is present in the matrix, so the output is 1.

Input: mat[][] = [[14, 34, 23, 95, 43, 28]], x = 55
Output: false
Explanation: 55 is not present in the matrix, so the output is 0.

Input: mat[][] = [[87, 9, 99],[101, 3, 111]], x = 101
Output: true
Explanation: 101 is present in the matrix.

Constraints:
1 <= mat.size(), mat[0].size() <= 1000
1 <= mat[][] <= 10^5
1 <= x <= 10^5

Expected Complexities:
Time Complexity: O(n * m)
Auxiliary Space: O(1)
*/

public class SearchInAMatrix {
    public boolean searchMatrix(int[][] mat, int x){
        boolean flag = false;
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                if(mat[i][j] == x){
                    flag = true;
                }
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4,5}};
        SearchInAMatrix obj = new SearchInAMatrix();
        System.out.println(obj.searchMatrix(matrix, 1));
    }
}
