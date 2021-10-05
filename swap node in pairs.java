class Solution {
    public ListNode swapPairs(ListNode head) {
        if((head==null) || (head.next==null))
            return head;
        ListNode ListNode1=head.next;
        head.next=swapPairs(head.next.next);
        ListNode1.next=head;
        return ListNode1;
        }
        
    }