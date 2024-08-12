//if you want to delete a node  in between and the head is not provided
//node passed in delelete node function is the node u have to delete

 public class ListNode {
     int val;
     ListNode next;
    ListNode(int x) { val = x; }
 }
 
class Solution {
    public void deleteNode(ListNode node) {
        node.val=node.next.val;
        node.next=node.next.next;
    
    }
}
