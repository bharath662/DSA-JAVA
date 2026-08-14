/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/square-root/1
 * Platform     : GFG
 * Difficulty   : Easy
 */

class Solution {
    int floorSqrt(int n) {
       
        int low = 1;
        int high = n;
        int ans = 0;
        
        while(low <= high){
              int mid = (low + high)/2;
          if(mid * mid <= n){
            ans = mid;
            low = mid + 1;
            }
            else{
                high = mid -1;
            }
        }
        return ans;
    }
}
