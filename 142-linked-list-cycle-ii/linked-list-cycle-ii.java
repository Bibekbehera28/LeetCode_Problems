/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null) return null;
        ListNode slow = head;
        ListNode fast = head;
        boolean hasCycle = false;
        int len = 0;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow) {
                hasCycle = true;
                ListNode temp = slow;
                do {
                    temp = temp.next;
                    len++;
                } while(temp != slow);
                break;
            }  
        }
        if (!hasCycle) {
            return null;
        }
        ListNode s = head;
        ListNode f = head;
        while(len > 0) {
            s = s.next;
            len--;
        }

        while(f != s) {
            s = s.next;
            f = f.next;
        }

        return f;
    }
}