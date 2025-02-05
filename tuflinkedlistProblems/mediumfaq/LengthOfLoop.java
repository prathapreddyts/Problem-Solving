package tuflinkedlistProblems.mediumfaq;

import tuflinkedlistProblems.ListNode;

public class LengthOfLoop {
    private int findLength(ListNode slow, ListNode fast) {
        int cnt = 1;
        fast = fast.next;
        while (slow != fast) {
            cnt++;
            fast = fast.next;
        }
        return cnt;
    }
    public int findLengthOfLoop(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return findLength(slow, fast);
            }
        }
        return 0;
    }
}
