/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/find-unique-number/1
 * Platform     : GFG
 * Difficulty   : Easy
 */

class Solution {
    public int findUnique(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            ans = ans ^ nums[i];
        }
        return ans;
    }
}
