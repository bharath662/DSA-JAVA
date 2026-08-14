/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/number-of-occurrence2259/1
 * Platform     : GFG
 * Difficulty   : Easy
 */

class Solution {
    int countFreq(int[] arr, int target) {
        int n = arr.length;
        int count = 0;
        for(int i=0;i<n;i++){
            if(arr[i] == target){
                count++;
            }
        }
        return count;
    }
}

