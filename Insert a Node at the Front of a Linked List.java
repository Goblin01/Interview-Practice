// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public ListNode insertAtHead(ListNode head, int data) {
    ListNode newHead = new ListNode(data);
    newHead.next = head;
    return newHead;
}
