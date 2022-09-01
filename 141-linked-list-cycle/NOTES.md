1. We will have 2 pointers. 1st pointer is *slow pointer* which will move/traverse by *one node*, 2nd pointer is the* fast pointer* which will traverse* twice the speed of the slow pointer.*
2. Initially both the pointers will point to the head node.
`ListNode slow = head; ListNode fast = head;`
3. If the fast pointer points to null then that means there is no cycle.
4. So we will run a loop untill Fast pointer becomes null.
`fast != null && fast.next != null`
5. We will keep incrementing the slow pointer by 1 and fast pointer by 2.
` fast = fast.next.next; slow = slow.next;`
6. We will also keep a check that if slow == fast then we will return true.
```
while(fast != null && fast.next != null){
fast = fast.next.next;
slow = slow.next;
if(slow == fast)
return true;
}
```