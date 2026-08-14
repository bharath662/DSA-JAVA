/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/implement-upper-bound/1
 * Platform     : GFG
 * Difficulty   : Easy
 */

class Solution {
    int upperBound(int[] arr, int target) {
        for(int i=0;i<arr.length;i++){
            if(arr[i] > target){
                return i;
            }
        }
        return arr.length;
    }
}

