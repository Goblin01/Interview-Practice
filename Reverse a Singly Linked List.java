// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.
import java.util.*
import java.util.streams.*

public ListNode reverseList(ListNode head) {
    ListNode previous = null;
    // Iterate over the link list and
    // connect the next of each node to its previous node
    while(head != null) {
        ListNode next = head.next;
        head.next = previous;
        previous = head;
        head = next;
    }
    // last node is the new head of reversed list. 
    // Return new head
    return previous;
}
