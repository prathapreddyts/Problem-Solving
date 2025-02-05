package tuflinkedlistProblems.mediumfaq;

import tuflinkedlistProblems.ListNode;

public class IntersectionNode {
    public ListNode getIntersectionNode(ListNode head1, ListNode head2) {
        if (head1 == null || head2 == null) {
            return null;
        }
        ListNode currentHead1 = head1;
        while (currentHead1.next != null) {
            currentHead1 = currentHead1.next;
        }
        ListNode temp = currentHead1;
        currentHead1.next = head2;
        ListNode slowNode = head1, fastNode = head1;
        while (fastNode != null && fastNode.next != null) {
            fastNode = fastNode.next.next;
            slowNode = slowNode.next;
            if (slowNode == fastNode) {
                ListNode newStart = head1;
                while (newStart != slowNode) {
                    newStart = newStart.next;
                    slowNode = slowNode.next;
                }
                temp.next = null;
                return newStart;
            }
        }
        temp.next = null;
        return null;
    }

}
