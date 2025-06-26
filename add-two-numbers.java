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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode c1 = l1;
        ListNode c2 = l2;
    
        int val1 = l1.val;
        int val2 = l2.val;

        ListNode r = new ListNode(0);
        ListNode cr = r;
      
        while(true) {
            var total = cr.val + val1 + val2;
            var currentNodeValue = total % 10;
            var nextNodeValue = total / 10;

            cr.val = currentNodeValue;

            if (c1.next == null && c2.next == null && nextNodeValue == 0) {
                break;
            } else {
                if (c1.next != null) {
                    c1 = c1.next;
                    val1 = c1.val;
                } else {
                    val1 = 0;
                }
                if (c2.next != null) {
                    c2 = c2.next;
                    val2 = c2.val;
                } else {
                    val2 = 0;
                }
                cr.next = new ListNode(nextNodeValue);
                cr = cr.next;
            }
        }

        return r;
    }
}
