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
    public ListNode removeElements(ListNode head, int val) {
        //base case
        if(head == null) return null;
        
        //defining pointers
        ListNode dummy = new ListNode();
        dummy.next = head; 
        ListNode curr = head; ListNode pre = dummy;
        
        while(curr != null){
            if(curr.val == val){
                //perfom delete operation
                pre.next = curr.next;
                //incrementing the current pointer
                curr = pre.next;
            }
            else{
                //increment the pre and the curr pointer
                pre = curr;
                curr = curr.next;
            }
        }
        //return the head pointer
        return dummy.next;
    }
}