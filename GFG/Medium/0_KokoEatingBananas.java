/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/koko-eating-bananas/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

 class Solution {

    public int kokoEat(int[] arr, int h) {

        int low = 1;
        int high = 0;

   
        for (int bananas : arr) {
            high = Math.max(high, bananas);
        }

        int ans = high;

        while (low <= high) {

            int k = low + (high - low) / 2;
 
            int totalH = 0;

            for (int bananas : arr) {
                totalH += (int) Math.ceil((double) bananas / k);
            }
 
            if (totalH <= h) {
                ans = k;
                high = k - 1;
            } 
            else {
                low = k + 1;
            }
        }

        return ans;
    }
}

