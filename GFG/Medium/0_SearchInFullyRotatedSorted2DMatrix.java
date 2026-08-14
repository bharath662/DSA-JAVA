/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/search-in-fully-rotated-sorted-2d-matrix/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

class Solution {
    public boolean searchMatrix(int[][] mat, int x) {

        int rows = mat.length;
        int cols = mat[0].length;

        for (int i = 0; i < rows; i++) {

            int low = 0;
            int high = cols - 1;

            while (low <= high) {

                int mid = low + (high - low) / 2;

                if (mat[i][mid] == x) {
                    return true;
                }
                if (mat[i][low] <= mat[i][mid]) {

                    if (x >= mat[i][low] && x < mat[i][mid]) {
                        high = mid - 1;
                    } else {
                        low = mid + 1;
                    }
                }

                else {

                    if (x > mat[i][mid] && x <= mat[i][high]) {
                        low = mid + 1;
                    } else {
                        high = mid - 1;
                    }
                }
            }
        }

        return false;
    }
}
