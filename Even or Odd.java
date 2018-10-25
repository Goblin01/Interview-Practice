// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public Boolean isListEven(ListNode head) {
    if(head == null) return true;
    ListNode tmp = head;
    Boolean even = true;
    while(tmp != null){
        even = !even;
        tmp = tmp.next;
    }
    return even;
}
