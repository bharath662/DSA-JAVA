/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/linked-list-insertion-at-beginning/1
 * Platform     : GFG
 * Difficulty   : Easy
 */

/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    public Node insertAtFront(Node head, int x) {
        Node newNode = new Node(x); 
        newNode.next = head;
        head = newNode;
        return head;
    }
}
