/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/majority-element-1587115620/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

class Solution {
    int majorityElement(int arr[]) {

        int n = arr.length;
        int candidate = -1;
        int count = 0;
 
        for (int num : arr) {
            if (count == 0) {
                candidate = num;
                count = 1;
            } else if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

    
        count = 0;
        for (int num : arr) {
            if (num == candidate) {
                count++;
            }
        }

        
        if (count > n / 2) {
            return candidate;
        } else {
            return -1;
        }
    }
}
