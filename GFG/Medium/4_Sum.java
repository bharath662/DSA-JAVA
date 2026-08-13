/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/find-all-four-sum-numbers1732/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

class Solution {
    public static ArrayList<ArrayList<Integer>> fourSum(int[] arr, int k) {

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        int n = arr.length;

        Arrays.sort(arr);

        for (int i = 0; i < n - 3; i++) {

            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }

            for (int j = i + 1; j < n - 2; j++) {

                if (j > i + 1 && arr[j] == arr[j - 1]) {
                    continue;
                }

                int left = j + 1;
                int right = n - 1;

                while (left < right) {

                    long sum = (long) arr[i]
                             + arr[j]
                             + arr[left]
                             + arr[right];

                    if (sum == k) {

                        ArrayList<Integer> temp = new ArrayList<>();

                        temp.add(arr[i]);
                        temp.add(arr[j]);
                        temp.add(arr[left]);
                        temp.add(arr[right]);

                        ans.add(temp);

                        left++;
                        right--;

                        while (left < right && arr[left] == arr[left - 1]) {
                            left++;
                        }

                        while (left < right && arr[right] == arr[right + 1]) {
                            right--;
                        }

                    } else if (sum < k) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }

        return ans;
    }
}
