package leetcode;

public class SwapNodesinPairs {
	
	public static ListNode swapPairs(ListNode head) {
		if(head==null||head.next==null) return head;
        ListNode res = new ListNode(0);
        ListNode before = res;
        ListNode after = null;
        ListNode buf = null;
        while(head!=null){
            buf = new ListNode(head.val);
            before.next = buf;
            after = buf;
            head = head.next;
            if(head==null) return res.next;
            buf = new ListNode(head.val);
            before.next = buf;
            buf.next = after;
            before = after;
            head = head.next;
        }
        return res.next;
    }
}

class ListNode {
	     int val;
	     ListNode next;
	     ListNode(int x) { val = x; }
	  }
