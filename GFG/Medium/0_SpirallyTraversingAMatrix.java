/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/spirally-traversing-a-matrix-1587115621/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

class Solution {
    public ArrayList<Integer> spirallyTraverse(int[][] matrix) {
        ArrayList<Integer> ans = new ArrayList<>();
        int rows = matrix.length;
        int cols = matrix[0].length;
        int top = 0;
        int bottom = rows - 1;
        int left = 0;
        int right = cols - 1;
        
        while(top <= bottom && left <= right){
            //left to right
            for(int j = left; j <= right; j++){
                ans.add(matrix[top][j]);
            }
            top++;
            //top to bottom
            for(int i = top; i <= bottom; i++){
                ans.add(matrix[i][right]);
            }
            right--;
            //right to left
            if(top <= bottom){
                for(int j = right; j >= left; j--){
                    ans.add(matrix[bottom][j]);
                }
                bottom--;
            }
            if(left <= right){
                for(int i = bottom; i >= top; i--){
                    ans.add(matrix[i][left]);
                }
                left++;
            }
        }
        return ans;
    }
}

