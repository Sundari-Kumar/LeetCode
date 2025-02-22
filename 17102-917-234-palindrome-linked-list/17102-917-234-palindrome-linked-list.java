class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true; // Edge case

        // Step 1: Find the middle
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse second half
        ListNode prev = null, cur = slow;
        while (cur != null) {
            ListNode nextNode = cur.next;
            cur.next = prev;
            prev = cur;
            cur = nextNode;
        }

        // Step 3: Compare first and second half
        ListNode firstHalf = head;
        ListNode secondHalf = prev; // New head of reversed second half
        while (secondHalf != null) {
            if (firstHalf.val != secondHalf.val) return false;
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        return true;
    }
}
