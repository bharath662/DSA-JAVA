/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/minimum-element-in-a-sorted-and-rotated-array3611/1
 * Platform     : GFG
 * Difficulty   : Easy
 */

class Solution {
    public int findMin(int[] arr) {
        int n = arr.length;
        int  minVal = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            minVal=Math.min(minVal,arr[i]);
        }
        return minVal;
    }
}

