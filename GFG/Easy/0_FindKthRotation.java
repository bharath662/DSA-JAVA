/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/rotation4723/1
 * Platform     : GFG
 * Difficulty   : Easy
 */

class Solution {
    public int findKRotation(int arr[]) {
        int n = arr.length;
        int minVal = arr[0];
        int minIndex = 0;
        for(int i=1; i<n; i++){
            if(arr[i] < minVal){
                minVal =arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
}
