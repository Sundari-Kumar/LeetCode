class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) return null;

        // Step 1: Create interleaved copied nodes
        Node cur = head;
        while (cur != null) {
            Node copy = new Node(cur.val);
            copy.next = cur.next;
            cur.next = copy;
            cur = copy.next;
        }

        // Step 2: Set random pointers for the copied nodes
        cur = head;
        while (cur != null) {
            if (cur.random != null) {
                cur.next.random = cur.random.next;
            }
            cur = cur.next.next;
        }

        // Step 3: Separate the original and copied nodes
        Node original = head;
        Node copy = head.next;
        Node copyHead = copy;

        while (original != null) {
            original.next = original.next.next;
            if (copy.next != null) {
                copy.next = copy.next.next;
            }
            original = original.next;
            copy = copy.next;
        }

        return copyHead;
    }
}
