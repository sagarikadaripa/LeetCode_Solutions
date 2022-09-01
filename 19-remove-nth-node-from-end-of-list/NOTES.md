node = node.next;
}
```
2. Keep a counter to track that which node to delete starting from the beginning. `int count = size - n`
3.  if count = 0. then the first node has to be deleted to just move the head pointer to the next node.
```
if(count == 0){
return head.next;
}
```
4. keep decrementing the count value till you reach the node previous you want to delete.
```
while(count-- > 1){
node = node.next;
}
```
5. just point the next of the current node to the next next of the current node.
```
node.next = node.next.next;
```
6. return the head;
​
**Problem** with the above solution is that we are doing *two passes* over the linked list. 1st pass to find the size of the linkedlist and on the 2nd pass we are deleting the node.
​
# Approach 2
We will use slow and fast pointer technique to solve the problem in one pass.
So the distance between the slow and the fast pointer will be equal to N.
1. We will have a dummy node created and the next of the dummy will point to the head node.
2. The *slow pointer* will point to the *dummy node* and the *fast pointer* will point to *node which at N distance* from the slow pointer.
​