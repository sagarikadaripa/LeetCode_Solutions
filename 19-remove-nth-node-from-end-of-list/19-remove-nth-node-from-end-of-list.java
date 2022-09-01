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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        if(head == null || head.next == null) return null;
        //finding the size of the linkedList
        int size = 0;
        ListNode node = head;
        while(node != null){
            size++;
            node = node.next;
        }
        
        
        int count = size - n;
        //deleting the 1st node
        if(count == 0){
            return head.next;
        }
        node = head; //we have iterated through this node pointer to know the size, so it will be                                               pointing to the last node
        while(count-- > 1){
            node = node.next;
        }
          node.next = node.next.next; 
         return head;
    }
}