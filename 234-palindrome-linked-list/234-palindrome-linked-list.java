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
    public ListNode reverse(ListNode head){
        
        ListNode pre = null;
        while(head != null){
            ListNode next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }
    public boolean isPalindrome(ListNode head) {
        //Find the mid
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        //now slow points to the mid
        
        //1-> 2-> 3->NULL
        if(fast != null) slow = slow.next;
        
        //Reverse the list
        ListNode revHead = reverse(slow);
        while(revHead != null){
            if(revHead.val != head.val) return false;
            else{
                //increment the pointer
                revHead = revHead.next;
                head = head.next;
            }
        }
        return true;
    }
}