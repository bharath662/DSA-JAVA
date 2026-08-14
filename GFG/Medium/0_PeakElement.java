/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/peak-element/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

class Solution {
    public int peakElement(int[] arr) {
        int n = arr.length;
        for(int i=0;i<n;i++){
            if((i==0 || arr[i] >= arr[i-1]) && (i==n-1 || arr[i] >= arr[i+1])){
                return i;
            }
        }
        return -1;
    }
}
