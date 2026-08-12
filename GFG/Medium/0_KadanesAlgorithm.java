/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/kadanes-algorithm-1587115620/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

class Solution {
    int maxSubarraySum(int[] nums) {
        int sum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            maxSum = Math.max(maxSum, sum);
        if(sum<0){
            sum=0;
        }
    }
    return maxSum;
}
}
