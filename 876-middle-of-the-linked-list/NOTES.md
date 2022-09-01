# Approach 1
1. First find the size of the linked list.
2. move the node to the head position again.
3. Make a counter  count = (size/2) + 1.
4. Traverse the node until the node become null.
5. Node will point to the middle of the Linked List.
6. Make that node the head.
7. Return the head
```
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
```
​
# Approach 2
​
1. Initially point both fast and slow pointer to the head node.
```
ListNode slow = head;
ListNode fast = head;
```
2. Move the slow pointer by one node and fast pointer by 2 nodes untill fast becomes null.
```
while(fast != null && fast.next != null){
slow = slow.next;
fast = fast.next.next;
}