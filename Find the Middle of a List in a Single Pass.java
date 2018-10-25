// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public ListNode findMiddleNode(ListNode head) {
    ListNode slow, fast;
    
    fast = head;
    slow = head;
    while(fast != null && fast.next != null && (fast.next).next != null){
        fast = (fast.next).next;
        slow = slow.next;
    }
    return slow;

}
