package tuflinkedlistProblems.fundamentals;

import tuflinkedlistProblems.ListNode;

public class LinkedListImplementation {

    public ListNode insertAtHead(ListNode head, int value)
    {
        if(head==null){
            head=new ListNode(value);
        }else{
            ListNode newNode= new ListNode(value);
            newNode.next=head;
            head=newNode;
        }
        return head;
    }
    public ListNode insertAtTail(ListNode head, int value) {
        if (head == null)
            return new ListNode(value);
        ListNode currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        ListNode newNode = new ListNode(value);
        currentNode.next = newNode;
        return head;
    }
    public ListNode insertAtKthPosition(ListNode head, int X, int K) {
        if (K <= 0) return head; // Invalid position
        if (head == null) {
            return (K == 1) ? new ListNode(X) : head;
        }
        if (K == 1) {
            return new ListNode(X, head);
        }
        ListNode temp = head;
        int cnt = 1;
        while (temp != null && cnt < K - 1) {
            temp = temp.next;
            cnt++;
        }
        if (temp != null) {
            ListNode newNode = new ListNode(X, temp.next);
            temp.next = newNode;
        }
        return head;
    }
    public ListNode insertBeforeX(ListNode head, int X, int val) {
        if (head == null) return null;
        if (head.val == X) {
            return new ListNode(val, head);
        }
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null && curr.val != X) {
            prev = curr;
            curr = curr.next;
        }
        if (curr != null) {
            prev.next = new ListNode(val, curr);
        }

        return head;
    }


}
