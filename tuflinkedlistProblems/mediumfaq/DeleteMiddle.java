package tuflinkedlistProblems.mediumfaq;

import tuflinkedlistProblems.ListNode;

public class DeleteMiddle {
    public ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null) {
            return null; // If the list has 0 or 1 nodes, return null
        }

        ListNode prev = null;
        ListNode fast = head;
        ListNode slow = head;

        // Move `fast` by 2 steps and `slow` by 1 step
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            prev = slow;
            slow = slow.next;
        }

        // Remove the middle node
        if (prev != null) {
            prev.next = slow.next;
        }

        return head;
    }

}
