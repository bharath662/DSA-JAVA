/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/find-the-element-that-appears-once-in-sorted-array0624/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

class Solution {
    public int single(int[] arr) {
        int n = arr.length;
        int ans = 0;
        for(int i=0;i<n;i++){
            ans ^= arr[i];
        }
        return ans;
    }
}
