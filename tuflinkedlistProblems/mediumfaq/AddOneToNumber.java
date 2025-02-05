package tuflinkedlistProblems.mediumfaq;

import tuflinkedlistProblems.ListNode;

public class AddOneToNumber {
    public ListNode addOne(ListNode head) {
        ListNode listNode1 = reverse(head);
        int carry = 1;
        ListNode newHead = null, tail = null;
        while (listNode1 != null || carry > 0) {
            int sum = carry;
            if (listNode1 != null) {
                sum += listNode1.val;
                listNode1 = listNode1.next;
            }
            carry = sum / 10;

            ListNode newNode = new ListNode(sum % 10);

            if (newHead == null) {
                newHead = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }
        return reverse(newHead);
    }

    public ListNode reverse(ListNode head) {
        ListNode revHead = null;
        while (head != null) {
            ListNode nextNode = head.next;
            head.next = revHead;
            revHead = head;
            head = nextNode;
        }
        return revHead;
    }

}
