/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/search-in-a-row-wise-sorted-matrix/1
 * Platform     : GFG
 * Difficulty   : Easy
 */

class Solution {
    public boolean searchRowMatrix(int[][] mat, int x) {

        int n = mat.length;
        int m = mat[0].length;

        for (int i = 0; i < n; i++) {

            int low = 0;
            int high = m - 1;

            while (low <= high) {

                int mid = ( low + high ) / 2;

                if (mat[i][mid] == x) {
                    return true;
                }
                else if (mat[i][mid] < x) {
                    low = mid + 1;
                }
                else {
                    high = mid - 1;
                }
            }
        }

        return false;
    }
}
