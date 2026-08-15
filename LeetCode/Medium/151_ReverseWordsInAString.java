/**
 * Problem Link : https://leetcode.com/problems/reverse-words-in-a-string/
 * Platform     : LeetCode
 * Difficulty   : Medium
 */

class Solution {
    public String reverseWords(String s) {
        List<String> words = new ArrayList<>();

        // to store single word
        StringBuilder word = new StringBuilder();
        
        for(int i=0;i<s.length();i++){
            //if no space add to current word
            if(s.charAt(i) != ' '){
                word.append(s.charAt(i));
            }
            // if space and word is formed 
            else if(word.length() > 0){
                // add word to the list 
                words.add(word.toString());
                //word reset
                word.setLength(0);
            }
        }
        if(word.length() > 0){
        words.add(word.toString());
        }
        
        Collections.reverse(words);
        return String.join(" ", words);
    }
}
