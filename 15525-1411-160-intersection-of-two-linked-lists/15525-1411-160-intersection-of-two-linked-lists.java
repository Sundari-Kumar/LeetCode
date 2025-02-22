class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;

        ListNode pointerA = headA;
        ListNode pointerB = headB;

        while (pointerA != pointerB) {
            // Debugging: Print current pointer values
            System.out.println("PointerA: " + (pointerA != null ? pointerA.val : "null"));
            System.out.println("PointerB: " + (pointerB != null ? pointerB.val : "null"));

            pointerA = (pointerA == null) ? headB : pointerA.next;
            pointerB = (pointerB == null) ? headA : pointerB.next;
        }

        // Debugging: Print final result
        System.out.println("Intersection Node: " + (pointerA != null ? pointerA.val : "null"));

        return pointerA;
    }
}
