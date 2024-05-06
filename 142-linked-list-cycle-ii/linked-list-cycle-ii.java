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
    // fast, slow pointer approach
    public ListNode detectCycle(ListNode head) {
        System.out.println("starts detectCycle");
        ListNode slow = head;
        ListNode fast = head;
        int cycleLength = 0;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast) {
                cycleLength = cycleLength(slow);
                break;
            }
        }

        if(cycleLength == 0) { return null; }

        return findBeginningNode(head, cycleLength);
    }

    // given a point we know is in the cycle, iterate back through the cycle until we reach that point again
    public int cycleLength(ListNode meetingPoint) {
        System.out.println("Starts cycleLength");
        ListNode current = meetingPoint;
        int cycleLength = 0;

        while(true) {
            current = current.next;
            cycleLength++;

            if(current == meetingPoint) { break; }
        }

        return cycleLength;
    }

    // given a cycle length and linked list, put one pointer cycleLength ahead of the other pointer and iterate
    // until they meet each other
    public ListNode findBeginningNode(ListNode head, int cycleLength) {
        System.out.println("Starts findBeginningNode");
        ListNode pointer1 = head;
        ListNode pointer2 = head;

        for(int i = 0; i < cycleLength; i++) {
            pointer2 = pointer2.next;
        }

        while(pointer1 != pointer2) {
            pointer1 = pointer1.next;
            pointer2 = pointer2.next;
        }

        return pointer1;
    }
}