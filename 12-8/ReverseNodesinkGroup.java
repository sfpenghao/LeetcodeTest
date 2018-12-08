package leetcode;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class ReverseNodesinkGroup {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(k==1||k==0||head==null) return head;
        ListNode[] temp = new ListNode[k];
        ListNode res = new ListNode(0);
        res.next = head;
        ListNode cur = res;
        while(cur!=null){
            for(int i=0;i<k;i++){
                if(head==null)return res.next;
                temp[i] = head;
                head = head.next;
            }
            temp[0].next = temp[k-1].next;
            cur.next = temp[k-1];
            for(int i=k-1;i>0;i--){
                temp[i].next = temp[i-1]; 
            }
            cur=temp[0];
        }
        return res.next;
    }
}