package LeetCode;

import java.util.HashSet;

/**
 * @author abcd
 * @version 1.0
 * @date 2022/4/5 7:29
 */
public class LeetCode142 {
    public ListNode detectCycle(ListNode head) {
        HashSet<ListNode> set = new HashSet<>();
        while (head != null) {
            if (set.contains(head)) {
                return head;
            } else {
                set.add(head);
            }
            head = head.next;
        }
        return null;
    }
    public ListNode detectCycle2(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null) {
            slow = slow.next;
            if (fast.next != null) {
                fast = fast.next.next;
            } else {
                return null;
            }
            if (fast == slow) {
                ListNode pr = head;
                while (pr != slow) {
                    pr = pr.next;
                    slow = slow.next;
                }
                return pr;
            }
        }
        return null;
    }
}
