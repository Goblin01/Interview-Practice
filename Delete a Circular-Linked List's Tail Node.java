// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public ListNode deleteAtTail(ListNode head) {
    ListNode curr = head;
    while(curr.next.next != head){
        curr = curr.next;
    }
    curr.next = head;
    return head;
}
