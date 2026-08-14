/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/first-and-last-occurrences-of-x3116/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

class Solution {
    ArrayList<Integer> find(int arr[], int x) {

        int first = -1;
        int last = -1;
 
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                first = i;
                break;
            }
        }
 
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == x) {
                last = i;
                break;
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();

        ans.add(first);
        ans.add(last);

        return ans;
    }
}
