1. First we will check that a **cycle exits or not.** [https://leetcode.com/problems/linked-list-cycle/](http://)
2. If there is a cycle then we will **return** the node where both the slow and fast pointers     are meeting, ie **the meeting point of both pointers**, else null.
3. In order to find the node from where the cycle starts, we will need two pointer again. The first pointer will be the **start ie from the head node** and **the second pointer will have the meeting point** where initially both the slow and the fast pointers met.
```
ListNode start = head; //points to the starting node
ListNode meet = hasCycle(head); //points to the meeting point of the fast and slow pointers
```
4. Run a loop untill start becomes equal to meet( start == meet). The meeting point of both the pointer indicates the index from where the cycle is starting.
```
while(start != meet){
start = start.next;
meet = meet.next;
}
```
5. Return start pointer.