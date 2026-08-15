/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/find-the-peak-element-in-a-2d-matrix/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

class Solution {
    public ArrayList<Integer> findPeakGrid(int[][] mat) {

        int n = mat.length;
        int m = mat[0].length;

        int low = 0;
        int high = m - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            // Max element in the mid column
            int maxRow = 0;

            for (int i = 0; i < n; i++) {
                if (mat[i][mid] > mat[maxRow][mid]) {
                    maxRow = i;
                }
            }
 
            int left = (mid > 0)
                    ? mat[maxRow][mid - 1]
                    : Integer.MIN_VALUE;

            int right = (mid < m - 1)
                    ? mat[maxRow][mid + 1]
                    : Integer.MIN_VALUE;

            //  current element is a peak
            if (mat[maxRow][mid] >= left &&
                mat[maxRow][mid] >= right) {

                ArrayList<Integer> ans = new ArrayList<>();
                ans.add(maxRow);
                ans.add(mid);

                return ans;
            }

            // Move to left half
            if (left > mat[maxRow][mid]) {
                high = mid - 1;
            }

            // Move to right half
            else {
                low = mid + 1;
            }
        }

        return new ArrayList<>();
    }
}
