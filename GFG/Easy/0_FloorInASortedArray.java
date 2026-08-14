/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/floor-in-a-sorted-array-1587115620/1
 * Platform     : GFG
 * Difficulty   : Easy
 */

class Solution {
    static int findFloor(int[] arr, int x) {
        int n = arr.length;
        int ans = -1;
        int low =0;
        int high = n-1;
        while(low <= high){
            int mid = (low + high)/2;
            if(arr[mid] <= x){
                ans = mid;
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return ans;
    }
}

