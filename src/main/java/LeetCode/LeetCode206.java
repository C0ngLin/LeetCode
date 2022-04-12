package LeetCode;

/**
 * @author abc
 * @version 1.0
 * @date 2022/4/6 11:37
 */
public class LeetCode206 {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode cur = new ListNode();
        while (cur != null) {
            ListNode tmp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = tmp;
        }
        return cur;
    }
}
