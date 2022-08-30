/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
     public ListNode hasCycle(ListNode head) {
        
        //base case
        if(head == null || head.next == null) return null;
        
        //defining the fast and slow pointers
        ListNode slow = head; ListNode fast = head;
        
        //traverse the list to see if there is a cycle or not
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast)
                return slow;
        }
        //return null if there is no cycle
        return null;
    }
    public ListNode detectCycle(ListNode head) {
        
        //defining the pointers
        ListNode start = head; //points to the starting node
        ListNode meet = hasCycle(head); //points to the meeting point of the fast and slow pointers
        
        //edge case if there is no meeting point simply return null
        if(meet == null) return null;
        
        
        while(start != meet){
            start = start.next;
            meet = meet.next;
        }
        return start;
    }
}