/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/row-with-max-1s0023/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

class Solution {
    public int rowWithMax1s(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;
        
        int maxOnes = 0;
        int ans = -1;
        for (int i=0;i<rows;i++){
            int low = 0;
            int high = cols -1;
            
            while(low <= high){
                int mid = (low + high)/2;
                if(mat[i][mid] == 1){
                    high = mid - 1;
                }
                else{
                    low = mid + 1;
                }
            }
            int ones = cols - low;

            if (ones > maxOnes) {
                maxOnes = ones;
                ans = i;
        }
    }
    return ans;
}
}
