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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        if(head==null || head.next==null)return head;
        ListNode i = head,j = head.next;
        while(j!=null){
            if(i.val==j.val){
                j=j.next;
                i.next = i.next.next;
            }
            else{
                j = j.next;
                i = i.next;
            }
        }
        return head;
    }
}