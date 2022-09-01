/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        
        ListNode node = head;
        int size = 0;
        while(node != null){
            node = node.next;
            size++;
        }
        node = head;
        int count = (size/2) + 1;
        while(count-- > 1){
            node = node.next;
        }
        head = node;
        while(node != null){
            node = node.next;
        }
        return head;
    }
}