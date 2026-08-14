/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/search-in-rotated-array-2/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

class Solution {
    public boolean search(int[] arr, int key) {
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i] == key){
                return true;
            }
        }
        return false;
    }
}

