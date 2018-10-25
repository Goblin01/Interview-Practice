// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public ListNode insertAtTail(ListNode head, int data) {
    ListNode curr = head;
    if(curr == null) return new ListNode(data);
    while(curr.next != null){
        curr = curr.next;
    }
    curr.next = new ListNode(data);
    return head;
}
