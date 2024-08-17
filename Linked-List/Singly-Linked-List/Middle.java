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
    int getlength(ListNode head){
    ListNode current = head;
    int length = 0;
    while(current!=null){
        current=current.next;
        length++;
    }
    return length;
}

    public ListNode middleNode(ListNode head) {
         int length = getlength(head);
        for(int i = 0;i<length/2 ;i++){
            head = head.next;
        }
        return head;
    }
}
