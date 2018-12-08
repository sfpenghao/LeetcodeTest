/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0) return null;
        if(lists.length==1) return lists[0];
        ListNode res = new ListNode(0);
        int len = lists.length;
        for(int i=0;i<len;i++){
            if(i==0){
                res.next = mergeTwoLinks(lists[i],lists[i+1]);
                i++;
            }else{
                res.next = mergeTwoLinks(lists[i],res.next);
            }
        }
        return res.next;
    }
    
    public ListNode mergeTwoLinks(ListNode l1,ListNode l2){
        if(l1==null) return l2;
        if(l2==null) return l1;
        if(l1.val<l2.val){
            l1.next = mergeTwoLinks(l1.next,l2);
            return l1;
        }else{
            l2.next = mergeTwoLinks(l1,l2.next);
            return l2;
        }
    }
}
