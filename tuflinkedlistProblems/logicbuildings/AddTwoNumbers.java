package tuflinkedlistProblems.logicbuildings;

import tuflinkedlistProblems.ListNode;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode listNode1, ListNode listNode2) {
        int carry = 0;
        ListNode head = null;
        ListNode tail = null;
        while (listNode1 != null || listNode2 != null || carry > 0) {
            int sum = carry;
            if (listNode1 != null) {
                sum += listNode1.val;
                listNode1 = listNode1.next;
            }
            if (listNode2 != null) {
                sum += listNode2.val;
                listNode2 = listNode2.next;
            }
            carry = sum / 10;
            ListNode newNode = new ListNode(sum % 10);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }
        return head;
    }

}
