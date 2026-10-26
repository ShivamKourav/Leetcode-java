/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode oddEvenList(ListNode head) {
        ListNode odddum = new ListNode(0);
        ListNode evendum = new ListNode(0);

        ListNode odd = odddum;
        ListNode even = evendum;

        int pos = 1;

        while (head != null) {
            ListNode next = head.next;

            if (pos % 2 != 0) {
                odd.next = head;
                odd = odd.next;
            } else {
                even.next = head;
                even = even.next;
            }

            head = next;
            pos++;
        }

        even.next = null;
        odd.next = evendum.next;

        return odddum.next;
    }
}
