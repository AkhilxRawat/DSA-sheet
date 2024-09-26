/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headB==null||headA==null){
            return null ;

        }
        
        ListNode L1 = headA;
        ListNode L2 = headB;
        while(L1 != L2){
            L1 = L1.next;
         L2 = L2.next;
        if(L1 == L2 ){
            return L1;
        }
         if(L1==null){
            L1 = headB;
         }
         if(L2==null){
          L2 = headA;
         }
         
        }
        return  L1;
         
    }
}
