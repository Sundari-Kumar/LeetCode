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
    public ListNode reverseBetween(ListNode head, int left, int right) {
    if(head==null||head.next==null||left-right==0){
            return head;
        }
    ListNode dummy=new ListNode(0);
    dummy.next=head;
    ListNode prevLeft=dummy;
    ListNode cur=head;
    for(int i=0;i<left-1;i++){
        prevLeft=prevLeft.next;
    }
    cur=prevLeft.next;
    ListNode prev=null;
    for(int i=0;i<right-left+1;i++){
        ListNode nextNode=cur.next;
        cur.next=prev;
        prev=cur;
        cur=nextNode;

    } 
    prevLeft.next.next=cur; 
    prevLeft.next=prev;
    
    return dummy.next;
    }
}