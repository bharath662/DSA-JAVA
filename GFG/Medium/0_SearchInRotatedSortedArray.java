/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/search-in-a-rotated-array4618/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

class Solution {
    int search(int[] arr, int key) {
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
}
