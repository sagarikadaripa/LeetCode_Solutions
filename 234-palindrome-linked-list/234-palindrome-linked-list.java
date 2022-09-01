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
    public boolean isPalindrome(int arr[],int n){
        
        for(int i = 0 ;i <= n/2;i++){
            if(arr[i] != arr[n-i-1])
                return false;
        }
        return true;
    }
    public boolean isPalindrome(ListNode head) {
         //find the size of the LinkedList
        int size = 0;
        ListNode node = head;
        while(node != null){
            size++;
            node = node.next;
        }
        node = head;
        //Storing the value of the linkedList into an array
        int arr[] = new int[size];
        int i = 0;
        while(node != null){
            arr[i] = node.val;
            i++;
            node = node.next;
        }
        boolean ans = isPalindrome(arr,size);
        return ans;
    }
}