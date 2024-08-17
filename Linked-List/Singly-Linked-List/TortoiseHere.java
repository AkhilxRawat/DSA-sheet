/**                                  This is to find Middle of a LL using tortoise here method where tortoise is a slow pointer and here is fast pointer
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


    public ListNode middleNode(ListNode head) {
        ListNode tortoise = head;
        ListNode here = head;
        while(here!=null&&here.next!=null){
             tortoise = tortoise.next;
             here = here.next.next;
        }
        return tortoise;
    }
}
