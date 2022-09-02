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
    public int pairSum(ListNode head) {
        
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        if(fast != null) slow = slow.next;
        
        ListNode revHead = reverse(slow);
        
        
        int sum = 0,maxSum = Integer.MIN_VALUE;
        while(revHead != null){
            sum = head.val + revHead.val;
            maxSum = Math.max(maxSum,sum);
            head = head.next;
            revHead = revHead.next;
        }
        return maxSum;
    }
}