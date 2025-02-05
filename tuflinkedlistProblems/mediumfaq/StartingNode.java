package tuflinkedlistProblems.mediumfaq;

import tuflinkedlistProblems.ListNode;

public class StartingNode {
    public ListNode findStartingPoint(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        boolean isLoopExist = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                isLoopExist = true;
                break;
            }
        }
        if (isLoopExist) {
            slow = head;
            while (slow != fast) {
                slow = slow.next;
                fast = fast.next;
            }
            return slow;
        }
        return null;
    }
}
