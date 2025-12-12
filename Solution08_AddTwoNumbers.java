public class Solution08_AddTwoNumbers {

    // list node
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
    }

    public ListNode solve(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        int carry = 0;

        // Add digits while nodes remain
        while (l1 != null || l2 != null || carry > 0) {
            int sum = carry;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            // Create new node for current digit
            curr.next = new ListNode(sum % 10);
            curr = curr.next;

            carry = sum / 10;
        }

        return dummy.next;
    }

    public ListNode createLinkedList(int[] nums) {
        ListNode dummy = new ListNode(-1);
        ListNode tmp = dummy;
        for (int num : nums) {
            tmp.next = new ListNode(num);
            tmp = tmp.next;
        }
        return dummy.next;
    }

    public void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Solution08_AddTwoNumbers s = new Solution08_AddTwoNumbers();
        ListNode l1 = s.createLinkedList(new int[]{1,2,3});
        ListNode l2 = s.createLinkedList(new int[]{4,5,6});

        ListNode ans = s.solve(l1, l2);  // Expected: 5 -> 7 -> 9
        s.printList(ans);
    }
}
