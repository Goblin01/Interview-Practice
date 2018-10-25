// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public ListNode deleteAtTail(ListNode head) {
    
    if(head == null || head.next == null) return null;
    ListNode curr = head;
    while(curr.next.next != null){
        curr = curr.next;
    }
    curr.next = null;
    return head;
}
