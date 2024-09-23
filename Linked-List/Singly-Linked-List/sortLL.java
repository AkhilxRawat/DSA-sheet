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
    public ListNode sortList(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
       ListNode middle =  middle(head);
       
       ListNode right = middle.next;
        middle.next = null;
        ListNode left = head;
       left =  sortList(left);
       right = sortList(right);
        return merge(left,right);
        
    }
    public ListNode middle(ListNode head){
        if(head==null||head.next==null){
            return head;
        }
ListNode slow = head;
ListNode fast = head.next;
while(fast!=null&&fast.next!= null){
    slow = slow.next;
    fast = fast.next.next;
}
return slow;
    }
    public ListNode merge(ListNode L1, ListNode L2){
     ListNode dummy = new ListNode();
     ListNode temp = dummy;
     while(L1!= null && L2!=null){
        if(L1.val<=L2.val){
            temp.next = L1;
        
            L1 = L1.next;
        }
        else{
            temp.next = L2;
    
            L2 = L2.next;
        }
        temp = temp.next;
        }
    if(L1!=null){
     temp.next = L1;
    }
    else{
        temp.next = L2;
    }
     
     return dummy.next;
    }
}
