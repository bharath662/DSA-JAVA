/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/row-with-max-1s0023/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

 class Solution {
 int rowWithMax1s(int arr[][]) {
     int maxRowIndex = -1;
     int maxCount = 0;
     int n=arr.length;
     int m=arr.length;

     for (int i = 0; i < n; i++) {
         int count = 0;
         for (int j = 0; j < m; j++) {
             if (arr[i][j] == 1) {
                 count++;
             }
         }

         if (count > maxCount) {
             maxCount = count;
             maxRowIndex = i;
         }
     }

     return maxRowIndex;
 }
 }
