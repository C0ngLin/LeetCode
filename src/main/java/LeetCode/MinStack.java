package LeetCode;

/**
 * @author abc
 * @version 1.0
 * @date 2022/4/5 15:24
 */
public class MinStack {
    private ListNode head;
    public MinStack() {

    }

    public void push(int val) {
        if (head == null) {
            head = new ListNode(val, val);
        }else {
            ListNode newnode = new ListNode(val,Math.min(val,head.min),head);
        }

    }

    public void pop() {
        head = head.next;
    }

    public int top() {
        return head.val;
    }

    public int getMin() {
        return head.min;
    }

    private class ListNode {
        int val;
        int min;
        ListNode next;

        private ListNode(int val, int min) {
            this.val = val;
            this.min = min;
        }

        private ListNode(int val, int min, ListNode next) {
            this.val = val;
            this.min = min;
            this.next = next;
        }
    }
}
