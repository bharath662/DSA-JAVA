/**
 * Problem Link : https://leetcode.com/problems/remove-outermost-parentheses/
 * Platform     : LeetCode
 * Difficulty   : Easy
 */

class Solution {
    public String removeOuterParentheses(String s) {

        StringBuilder ans = new StringBuilder();
        int depth = 0;

        for (char ch : s.toCharArray()) {

            if (ch == '(') {
                if (depth > 0) {
                    ans.append(ch);
                }
                depth++;
            } 
            else {
                depth--;

                if (depth > 0) {
                    ans.append(ch);
                }
            }
        }

        return ans.toString();
    }
}
