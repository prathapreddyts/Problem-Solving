package tuflinkedlistProblems.logicbuildings;

import tuflinkedlistProblems.ListNode;

public class RemoveNthNodeFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode lenNode=head;
        int length = getLength(lenNode);
        ListNode current=head;
        ListNode prev=null;
        for(int i=0;i<length-n &&current!=null;i++ ){
            prev=current;
            current=current.next;
        }
        if(current!=null){
            prev.next=current.next;
        }else{
            prev.next=null;
        }
        return head;

    }

    public int getLength(ListNode head) {
        int len = 0;
        while (head != null) {
            len++;
            head = head.next;
        }
        return len;
    }
}
