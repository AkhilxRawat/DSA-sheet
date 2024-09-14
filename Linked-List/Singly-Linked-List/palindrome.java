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
    public ListNode reverse(ListNode node){
        ListNode temp = node;
        
        ListNode prev = null;
        while(temp!=null){
            ListNode next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;


          }
          return prev;
    }
    public boolean isPalindrome(ListNode head) {
        if(head==null||head.next==null){
            return true;
        }
        ListNode fast = head;
        ListNode slow = head;
        ListNode temp = head;
        while(fast!= null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
      ListNode newNode =  reverse(slow);
            while(newNode!=null){

                if(temp.val !=newNode.val){
                    return false;
                }
                temp = temp.next;
                newNode = newNode.next;
            }
            return true;



    }
}
