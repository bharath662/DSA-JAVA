/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/implement-lower-bound/1
 * Platform     : GFG
 * Difficulty   : Easy
 */

class Solution {
    int lowerBound(int[] arr, int x) {
      for(int i=0;i<arr.length;i++){
          if(arr[i] >= x){
              return i;
          }
      }
      return arr.length;
    }
}

