// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public ListNode deleteAtMiddle(ListNode head, int position) {
    if (position == 1) {
        return head == null? head : head.next;
    }  
    ListNode curr = head;
    ListNode prevNode = curr;
    int count = 0;
    while(curr != null) {
        count++;
        if(count == position) {
            prevNode.next = curr.next;
            curr.next = null;
        } 
        else {
            prevNode = curr;
            curr = curr.next;
        }
    }
    return head;
}
