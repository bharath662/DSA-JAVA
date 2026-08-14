/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/who-will-win-1587115621/1
 * Platform     : GFG
 * Difficulty   : Basic
 */

class Solution {
    public boolean binarySearch(int[] arr, int k) {
        int n=arr.length;
        int low=0;
        int high=n-1;
        while(low <= high){
            int mid = (low + high)/2;
            if(arr[mid] == k){
                return true;
            }
            else if(k > arr[mid]){
                low=mid+1;
            }
            else{
                high = mid - 1;
            }
        }
        return false;
    }
}
