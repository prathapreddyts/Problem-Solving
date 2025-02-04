package tuflinkedlistProblems.logicbuildings;

import tuflinkedlistProblems.ListNode;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode reverseHead=null;
        ListNode current=head;
        while(current!=null){
            ListNode tempNode = current.next;
            current.next=reverseHead;
            reverseHead=current;
            current=tempNode;
        }
        return reverseHead;

    }
}
